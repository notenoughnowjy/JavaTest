import java.util.Scanner;
// 추상화
abstract class Animal{
  public abstract String bark();
}

class Dog extends Animal{
  private String dogcry;

  public Dog(String dogcry){
    this.dogcry = dogcry;
  }

  @Override
  public String bark(){
    return dogcry;
  }
}


class Cat extends Animal{
  private String catCry;
  
  public Cat(String catCry){
  this.catCry = catCry;
  }
  public String bark(){
    return catCry;
  }
}

class Horse extends Animal{
  private String horseCry;

  public Horse(String horseCry){
    this.horseCry = horseCry;
  }
  public String bark(){
    return horseCry;
  }
}

class Fish{
  public void makeSound(){
    System.out.println("생선이 파닥인다.");
  }
}

class Dolpin extends Fish{
  public void makeSound(){
    System.out.println("파닥파닥");
  }
}

class GoldFish extends Fish{
  public void makeSound(){
    System.out.println("사락사락");
  }
}

// 코끼리
class Elephant extends Animal{
  String elephantCry;

  public Elephant(String elephantCry){
    this.elephantCry = elephantCry;
  }
  public String bark(){
    return elephantCry;
  }
}



public class practiceabstract2{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // 추상화
    Dog dog = new Dog(scanner.next());
    String howdogcry = dog.bark();

    
    Cat cat = new Cat(scanner.next());
    String howcatcry = cat.bark();

    Elephant elephant = new Elephant(scanner.next());
    String howelephantcry = elephant.bark();

    // 다형성
    Fish fish = new Fish();
    Fish Dolpinsound = new Dolpin();
    Fish GoldFish = new GoldFish();

    System.out.println();
    System.out.println("출력 라인");
    System.out.println(howdogcry);
    System.out.println(howcatcry);
    System.out.println(howelephantcry);
    System.out.println();
    fish.makeSound();
    Dolpinsound.makeSound();
    GoldFish.makeSound();
    

  }
}