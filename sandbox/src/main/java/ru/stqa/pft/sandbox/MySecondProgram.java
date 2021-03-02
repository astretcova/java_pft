package ru.stqa.pft.sandbox;


public class MySecondProgram {
  public static void main(String[] args) {
    Point s = new Point(-1, 3);
    Point r = new Point(6, 2);
    System.out.println("расстояния между точками = " + distance(s, r));
  }

  public static double distance(Point p1, Point p2){
    return Math.sqrt((Math.pow((p1.x - p2.x), 2)) + (Math.pow((p1.y - p2.y), 2)));
  }
}
