package ru.job4j.Arrays;

import org.junit.Test;
import ru.job4j.Arrays.FindLoop;

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
}