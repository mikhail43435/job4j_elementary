package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchAtt {

    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 1020),
                new Attachment("bug 2", 34),
                new Attachment("image 3", 13)
        );
        System.out.println(filterName(attachments));
        System.out.println("---");
        System.out.println(filterSize(attachments));
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getSize() > 100) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (att.getName().contains("bug")) {
                rsl.add(att);
            }
        }
        return rsl;
    }
}