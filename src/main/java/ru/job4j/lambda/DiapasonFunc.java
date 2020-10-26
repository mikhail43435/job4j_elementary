package test.java.main.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DiapasonFunc {
    public static void main(String[] args) {
        Function<Double, Double> func = new Function<Double, Double>() {
            @Override
            public Double apply(Double aDouble) {
                return aDouble * aDouble;
            }
        };
        List<Double> rls = diapason(1, 4, func);
    }

    public static List<Double> diapason(int  start, int  end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int index = start; index <= end; index++) {
            result.add(func.apply((double) index));
        }
        return result;
    }
}
