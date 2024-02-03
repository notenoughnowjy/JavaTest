// https://www.codetree.ai/missions/5/problems/until-the-moment-I-reach-one/introduction
// 각 자리 숫자들 중 짝수를 제외한 합

import java.util.Scanner;

public class recursion_exception_even_number_basic{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(even_number(n));
  }

  private static int even_number(int n) {
    if(n<10)
      if(n%2 == 0)
        return 0;
      else return n;
    
    int remainder = n%10;
    if(remainder % 2 == 0)
      return even_number(n/10);
    else return even_number(n/10) + remainder;
  }
}