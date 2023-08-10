import java.util.Scanner;

public class recursion_div_onehundred_resolve {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(recursion_div(n));
  }

  private static int recursion_div(int n) {
    if(n == 1)
      return 2;
    if(n == 2)
      return 4;
    return recursion_div(n-1) * recursion_div(n-2) % 100;
  }
}
