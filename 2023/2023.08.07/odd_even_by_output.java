// https://www.codetree.ai/missions/5/problems/output-value-based-on-odd-even-numbers/description
// 홀수 짝수에 따른 출력값

import java.util.Scanner;

public class odd_even_by_output{
  public static int memo[];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

    System.out.println(odd_or_even(n));
  }

  private static int odd_or_even(int n) {
    if(n == 1 || n == 2)
      return n;
    if(n%2 == 0){
      return odd_or_even(n-2) + n;
    }
    else{
      return odd_or_even(n-2) + n;
    }
  }
}