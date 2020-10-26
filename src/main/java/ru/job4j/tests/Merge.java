package test.java.main.tests;

import static java.lang.System.arraycopy;

public class Merge {

        public static int[] merge(int[] left, int[] right) {
            int[] rsl = new int[left.length + right.length];
            int counterLeft = 0, counterRight = 0, counterRsl = 0;

            while (counterLeft < left.length && counterRight < right.length) {
                if (left[counterLeft] <= right[counterRight]) {
                    rsl[counterRsl++] = left[counterLeft++];
                } else {
                    rsl[counterRsl++] = right[counterRight++];
                }
            }
            if (counterLeft < left.length) {
                arraycopy(left, counterLeft, rsl, counterRsl, left.length -  counterLeft);
            } else if (counterRight < right.length) {
                arraycopy(right, counterRight, rsl, counterRsl, right.length -  counterRight);
            }
            return rsl;
        }
}
