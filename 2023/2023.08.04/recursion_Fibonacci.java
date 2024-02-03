import java.util.Scanner;

public class recursion_Fibonacci {
  public static int memo[];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    int n = sc.nextInt();
    memo = new int[n+1];

    System.out.println(F(n));
  }

  private static int F(int n) {
    if(n == 1 || n == 0)
      return n;
    if(memo[n] != 0)
      return memo[n];
    memo[n] = F(n-2) + F(n-1);
    return memo[n];
  }
}
