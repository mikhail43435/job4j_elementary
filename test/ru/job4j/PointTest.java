package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceTest() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double expected = 2;
        double  out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}