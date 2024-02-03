// https://www.codetree.ai/missions/5/problems/factorial/description
// Factorial

import java.util.Scanner;

public class return_value_Factorial{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(Fact(n));
  }
  private static int Fact(int n){
    if(n == 0)
      return 1;
    // System.out.println(n);
    return Fact(n-1) * n;
  }
}