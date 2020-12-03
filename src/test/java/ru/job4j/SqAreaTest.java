package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.SqArea;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 4;
        int k = 1;
        double expected = 1;
        double  out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}