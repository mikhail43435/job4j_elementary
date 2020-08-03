package ru.job4j.oop.exception;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test
    public void calcThenFive() {
        Fact factorial = new Fact();
        assertThat(factorial.calc(5), is(120));
    }

    @Test
    public void calcThenOne() {
        Fact factorial = new Fact();
        assertThat(factorial.calc(1), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void calcThenMinusTwo() {
        Fact factorial = new Fact();
        factorial.calc(-2);
        //assertThat(factorial.calc(5), is(120));
    }
}