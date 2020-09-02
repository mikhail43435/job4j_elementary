package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] split1 = o1.split("/");
        String[] split2 = o2.split("/");

        int rsl = split1[0].compareTo(split2[0]);
         if (rsl != 0) {
             return  rsl;
         } else {
             return o1.compareTo(o2);
         }
/*        for (int index = 0; index < Integer.min(split1.length, split2.length); index++) {
            int result = split1[index].compareTo(split2[index]);
            if (result == 0) {
                continue;
            }
            return result;
        }
        if (split1.length < split2.length) {
            return -1;
        } else  if (split1.length > split2.length) {
            return +1;
        } else {
            return 0;
        }*/
        //return 0;
    }
}