// https://www.codetree.ai/missions/5/problems/square-of-each-digit/submissions
import java.util.Scanner;

public class recursion_part_sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(recursion(n));
  }

  private static int recursion(int n) {
    if(n<10)
      return n * n;
    return recursion(n/10) + ((n%10) * (n%10));
  }
}
