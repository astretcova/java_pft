package lesson1;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Marina");

    Sqeare s = new Sqeare(3);
    System.out.println("area square " + s.a + " =  " + s.areaSquare());

    Rectangle r = new Rectangle(2,4);
    System.out.println("area rectangle (" + r.a + ", " + r.b + ")"+ " =  " + r.areaRectangle());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}
