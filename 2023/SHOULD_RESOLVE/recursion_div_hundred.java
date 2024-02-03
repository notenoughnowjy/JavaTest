// https://www.codetree.ai/missions/5/problems/sequence-of-remainder-divided-by-100/description
// 값을 반환하는 재귀함수 / 100으로 나눈 나머지의 수열
import java.util.Scanner;

public class recursion_div_hundred {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(mul_and_div(n));
  }

  private static int mul_and_div(int n) {
    if(n == 1)
      return 2;
    if(n == 2)
      return 4;
    return mul_and_div(n-1) * mul_and_div(n-2) %100;
  }
}
