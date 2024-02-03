import java.util.Scanner;

public class TEST{
  public static int add(int a, int b){
    return a + b;
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    int test1 = scanner.nextInt();
    int test2 = scanner.nextInt();

    int totalnum = add(num1, num2);
    int totalnum2 = add(test1, test2);

    System.out.println(totalnum);
    System.out.println(totalnum2);
    }
}