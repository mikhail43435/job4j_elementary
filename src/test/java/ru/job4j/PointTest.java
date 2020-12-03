package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distanceTest2d() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}