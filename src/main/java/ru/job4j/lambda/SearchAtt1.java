package test.java.main.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt1 {

    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 1020),
                new Attachment("bug 2", 34),
                new Attachment("image 3", 13)
        );
        System.out.println("Sorted by name ''bug");
        System.out.println(filterName(attachments));
        System.out.println("---");
        System.out.println("Sorted by size > 100");
        System.out.println(filterSize(attachments));
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getSize() > 100;
            }
        };
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (filter(att, func)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> func = new Predicate<>() {
            @Override
            public boolean test(Attachment attachment) {
                return attachment.getName().contains("bug");
            }
        };
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
            if (filter(att, func)) {
                rsl.add(att);
            }
        }
        return rsl;
    }

    private static boolean filter(Attachment att, Predicate<Attachment> func) {
        return func.test(att);
    }
}