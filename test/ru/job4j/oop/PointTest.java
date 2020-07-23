package ru.job4j.oop;

import org.junit.Test;
import ru.job4j.oop.Point;

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
    @Test
    public void distanceTest3d() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(3, 3, 3);
        double expected = 3.46;
        double out = a.distance3d(b);
        assertEquals(expected, out, 0.01);
    }
}