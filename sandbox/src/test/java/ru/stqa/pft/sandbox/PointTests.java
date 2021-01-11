package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.Runner.pointDistance;

public class PointTests {

    @Test
    public void testDistance1(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        assert p1.distance(p2)==4.242640687119285;
    }

    @Test
    public void testDistance2(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        Assert.assertEquals(p1.distance(p2),4.242640687119285);
    }

    @Test
    public void testDistance3(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,3);
        Assert.assertEquals(p1.distance(p2), pointDistance(p1, p2));
    }

}
