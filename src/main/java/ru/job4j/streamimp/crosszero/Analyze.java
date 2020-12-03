package ru.job4j.streamimp.crosszero;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    /**
     * Метод averageScore вычисляет общий средний балл.
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(e -> e.getSubjects().stream())
                .mapToInt(e -> e.getScore())
                .average()
                .orElse(0);
    }

    /**
     * Метод averageScoreBySubject вычисляет средний балл ученика по его предметам.
     * Возвращает список из объекта Tuple (имя ученика и средний балл).
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return  stream
                .map(e -> new Tuple(e.getName(), e.getSubjects().stream()
                        .mapToInt(c -> c.getScore())
                        .average()
                        .orElse(0)))
                .collect(Collectors.toList());
    }

    /**
     * Метод averageScoreByPupil вычисляет средний балл по всем предметам для каждого ученика.
     * Возвращает список из объекта Tuple (название предмета и средний балл).
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(e -> e.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(e -> new Tuple(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Метод bestStudent - возвращает лучшего ученика.
     * Лучшим считается ученик с наибольшим баллом по всем предметам.
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return  stream
                .map(e -> new Tuple(e.getName(), e.getSubjects().stream().mapToInt(Subject::getScore).sum()))
                .max((o1, o2) -> (int) o1.getScore() - (int) o2.getScore())
                .orElse(null);
    }

    /**
     * Метод bestSubject - возвращает предмет с наибольшим баллом для всех студентов.
     * Возвращает объект Tuple (имя предмета, сумма баллов каждого ученика по этому предмету)
     */

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(e -> e.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.summingInt(Subject::getScore)))
                .entrySet()
                .stream()
                .map(e -> new Tuple(e.getKey(), e.getValue()))
                .max((o1, o2) -> (int) (o1.getScore() - o2.getScore()))
                .orElse(null);
    }
}