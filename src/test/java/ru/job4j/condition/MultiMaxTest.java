package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void test1() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void test2() {
        int result = MultiMax.max(3, 1, 2);
        assertThat(result, is(3));
    }
    @Test
    public void test3() {
        int result = MultiMax.max(1, 4, 1);
        assertThat(result, is(4));
    }
    @Test
    public void test4() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}