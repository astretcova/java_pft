package lesson2;
public class TimeMachine {


  public static void main(String[] args) {

    //TimeMachine timeMachine = new TimeMachine();

    Cat tom = new Cat(12);
    Cat jerry = new Cat(5);

    jerry.goToFuture();
    System.out.println(jerry.age);
    tom.goToPast();
    System.out.println(tom.age);


  }
}


