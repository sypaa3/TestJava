package pl.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {


    @Test
    public void TestDistance() {

        Point p1 = new Point(5.0 , 6.0);
        Point p2 = new Point(3.0 , 2.0);
        Assert.assertEquals(p1.distance(p2), 4.47213595499958);
        assert p1.distance(p2) == 4.47213595499958;
//        Assert.assertEquals(p1.distance(p2), 2);  Negative test
//        assert p1.distance(p2) == 4.433333; Negative Test


    }

}
