package ru.job4j.steam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {

    public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student(10, "Surname1"));
            students.add(new Student(20, "Surname2"));
            students.add(new Student(30, "Surname3"));
            students.add(new Student(40, "Surname4"));
            students.add(new Student(50, "Surname5"));
            students.add(new Student(60, "Surname6"));
            students.add(new Student(70, "Surname7"));
            students.add(new Student(80, "Surname8"));
            students.add(new Student(90, "Surname9"));
            System.out.println(students);

    }

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }

    public static Map<String, Student> toMap(List<Student> list) {

        return   list.stream()
                .distinct().collect(Collectors.toMap(
                        e -> e.getSurname(),
                        e -> e));
    }
}
