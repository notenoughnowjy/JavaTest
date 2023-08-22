import java.util.Scanner;

class Bomb{
  String code;
  char color;
  int second;

  public Bomb(String code, char color, int second) {
    this.code = code;
    this.color = color;
    this.second = second;
  }
}

public class Object_bomb{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Bomb bomb = new Bomb(sc.next(), sc.next().charAt(0), sc.nextInt()); // (code, color, second)

    System.out.println("code : " + bomb.code);
    System.out.println("color : " + bomb.color);
    System.out.println("second : " + bomb.second);
  }
}