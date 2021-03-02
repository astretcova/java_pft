import java.security.PublicKey;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Marina");

    System.out.println("area square (3) =  " + areaSquare(3));
    System.out.println("area triangle (2, 3) =  " + areaTriangle(2, 3));
  }

  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }

  public static double areaSquare(double a) {

    return a * a;
  }

  public static double areaTriangle(double a, double b) {
    return a * b;
  }

}