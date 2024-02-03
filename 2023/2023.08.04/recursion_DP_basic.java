import java.util.Scanner;

public class recursion_DP_basic{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(F(n));
  }

  private static int F(int n) {
    if(n == 1)
      return 2;
    if(n == 2)
      return 7;
    return F(n-1) + 2 * F(n-2);
  }
}