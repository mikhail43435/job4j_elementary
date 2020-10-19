package ru.job4j.tests;

public class Merge {

        public static int[] merge(int[] left, int[] right) {
            int[] rsl = new int[left.length + right.length];
            int counterLeft = 0;
            int counterRight = 0;
            int counterRsl = 0;

            while (counterRsl < rsl.length) {
                if (counterLeft == left.length) {
                    for (int index = counterRight; index < right.length; index++) {
                        rsl[counterRsl++] = right[index];
                    }
                    return rsl;
                }
                if (counterRight == right.length) {
                    for (int index = counterLeft; index < left.length; index++) {
                        rsl[counterRsl++] = left[index];
                    }
                    return rsl;
                }
                if (left[counterLeft] <= right[counterRight]) {
                    rsl[counterRsl++] = left[counterLeft++];
                } else {
                    rsl[counterRsl++] = right[counterRight++];
                }
            }
            return rsl;
        }
}
