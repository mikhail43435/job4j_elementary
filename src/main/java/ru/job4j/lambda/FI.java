package test.java.main.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };

        System.out.println(atts);
/*        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };*/

        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();

        Arrays.sort(atts, comparator);
        System.out.println("-----");
        System.out.println(atts);

        //String ttt;
        //ttt.length()

        //  Comparator<String> cmpText = (left, right) -> left.compareTo(right);

          //      Comparator<String> cmpDescSize = (left, right) -> right.length() -  left.length();

    }
}