import java.util.Scanner;

public class recursion_Strange_progression_memoization {
  public static int memo[];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    memo = new int[n+1];

    System.out.println(Strange_progression(n));
  }

  private static int Strange_progression(int n) {
    if(n == 1)
      return 1;
    if(n == 2)
      return 2;
    if(memo[n] != 0)
      return memo[n];
    memo[n] = Strange_progression(n/3) + Strange_progression(n-1);
    return memo[n];
  }
}
