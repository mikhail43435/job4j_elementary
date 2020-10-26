package test.java.main.аrrays;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2, 11};
        int[] result = turner.back(input);
        int[] expect = new int[] {11, 2, 6, 1, 4};
        assertThat(result, is(expect));

    }

    @Test
    public void whenTurn11Elements() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turner = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] result = turner.back(input);
        int[] expect = new int[] {11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));

    }

}