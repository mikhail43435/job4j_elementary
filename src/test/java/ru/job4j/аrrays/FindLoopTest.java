package ru.job4j.аrrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int input[] = {6, 5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHasNoT8ThenMinus1() {
        int input[] = {5, 4, 3, 2};
        int value = 8;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

     @Test
     public void whenFindNegative() {
         int[] input = new int[]{5, 2, 10, 2, 4};
         int value = 22;
         int start = 2;
         int finish = 4;
         int result = FindLoop.indexOf(input, value, start, finish);
         int expect = -1;
         assertThat(result, is(expect));
    }
}