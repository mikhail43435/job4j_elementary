package test.java.main.cycles;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFive() {
        int rls = Factorial.calc(5);
        int expected = 120;
        assertEquals(rls, expected);
    }
    @Test
    public void whenCalculateFactorialEight() {
        int rls = Factorial.calc(8);
        int expected = 40320;
        assertEquals(rls,expected);
    }
    @Test
    public void whenCalculateFactorialZero() {
        int rls = Factorial.calc(0);
        int expected = 1;
        assertEquals(rls,expected);
    }
    @Test
    public void whenCalculateFactorialOne() {
        int rls = Factorial.calc(1);
        int expected = 1;
        assertEquals(rls,expected);
    }

}