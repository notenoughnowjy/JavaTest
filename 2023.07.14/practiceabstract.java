import java.util.Scanner;

abstract class Shape{
  public abstract double calculateArea();
}
class Circle extends Shape{
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  public double calculateArea(){
    return Math.PI * radius * radius;
  }
}



public class practiceabstract {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Circle circle = new Circle(scanner.nextDouble());
    double circleArea = circle.calculateArea();
    System.out.println("원의 넓이 : " + circleArea);
  }
}
