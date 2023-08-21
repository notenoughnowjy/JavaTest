import java.util.Scanner;

class Input{
  String string1;
  char char1;
  int time;

  public Input(String string1, char char1, int time) {
    this.string1 = string1;
    this.char1 = char1;
    this.time = time;
  }
}

public class Object_007 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Input input = new Input(sc.next(), sc.next().charAt(0), sc.nextInt());

    System.out.println("secret code : " + input.string1);
    System.out.println("meeting point : " + input.char1);
    System.out.println("time : " + input.time);
  }
}
