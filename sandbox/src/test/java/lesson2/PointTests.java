package lesson2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testZeroDistance(){
    Point p1 = new Point(1,1);
    Assert.assertEquals(p1.distance(p1), 0.);
  }

  @Test
  public void testOnXDistance(){
    Point p1 = new Point(1,1);
    Point p2 = new Point(1, 4);
    Assert.assertEquals(p2.distance(p1), 3.);
  }

  @Test
  public void testOnYDistance(){
    Point p1 = new Point(1,1);
    Point p2 = new Point(4, 1);
    Assert.assertEquals(p2.distance(p1), 3);
  }

  @Test
  public void testDiagonalDistance(){
    Point p1 = new Point(1,1);
    Point p2 = new Point(2, 2);
    Assert.assertEquals(p2.distance(p1), Math.sqrt(2));
  }
}
