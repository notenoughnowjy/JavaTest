class Fruit{
  String color;
  int number;

  public Fruit() {
    this.color = null;
    this.number = 0;
  }

  public Fruit(String color, int number) {
    this.color = color;
    this.number = number;
  }
}

public class Object_5_test {
  public static void main(String[] args) {
    Fruit apple = new Fruit("RED", 1);
    System.out.println("사과");
    System.out.println(apple.color);
    System.out.println(apple.number);

    System.out.println();

    Fruit banana = new Fruit();
    System.out.println("바나나");
    System.out.println(banana.color);
    System.out.println(banana.number);
  }
}
