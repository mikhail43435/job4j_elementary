package ru.job4j.collection;

import java.util.*;

//public class Departments implements Comparable<Departments> {
public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        //HashSet<String> tmp = new HashSet<>();
        TreeSet<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add(start + el);
                start = start + el + "/";
            }
        }
        List<String> rls = new ArrayList<>(tmp);
        //Collections.sort(rls);
        //rls.sort(Comparator.naturalOrder());
        return rls;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, Collections.reverseOrder());
    }
}