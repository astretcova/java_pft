package lesson2;


public class MySecondProgram {
  public static void main(String[] args) {
    Point p1 = new Point(3,1);
    Point p2 = new Point(2, 2);

    System.out.println("Расстояния между точками = " + p2.distance(p1));
    System.out.println("Расстояния между точками = " + p1.distance(p2));
  }
}
