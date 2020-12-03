package ru.job4j.streamImp.crosszero;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

   /* public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(e -> e.getSubjects().stream())
                .mapToInt(e -> e.getScore())
                .average()
                .orElse(0);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return  stream
                .map(e -> new Tuple(e.getName(), e.getSubjects().
                        stream().
                        mapToInt(c -> c.getScore())
                        .average()
                        .orElse(0)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {




       //Map<String, Integer> tmpMap = new HashMap<>();

       Map<String, Double> tmpMap = new HashMap<String, Double>();

       //stream.flatMap(e -> e.getSubjects()
       //        .stream()
       //        .map(c -> tmpMap.put(c.getName(), collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore) )))
               // .collect(  //) .map(c -> tmpMap.put(c.getName(), Collectors.averagingDouble(num -> (double) c.getScore()))).
               //  collect(Collectors.groupingBy(c -> c.getName(), Collectors.averagingDouble(Subject::getScore))))


                //Collectors.groupingBy(c -> c., Collectors.averagingDouble(d -> d.getScore())

        return List.of();
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return  stream
                .map(e -> new Tuple(e.getName(), e.getSubjects().stream().mapToInt(c -> c.getScore()).sum()))
                .max((o1, o2) -> (int) o1.getScore() - (int) o2.getScore())
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }*/
}