package test.java.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(2, 4, 6);
        Point b = new Point(3, 5, 17);
        double out = a.distance3d(b);
        double expected = 11.09;
        Assert.assertEquals(expected, out, 0.01);
    }
}