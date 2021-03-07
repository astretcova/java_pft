package lesson2;

public class Cat {

  int age;

  public Cat(int age) {
    this.age = age;
  }
  public void goToFuture() {
     this.age += 10;
  }

  public void goToPast() {
    this.age -= 10;
  }
}
