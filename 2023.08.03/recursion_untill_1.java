// https://www.codetree.ai/missions/5/problems/until-the-moment-I-reach-one/description
// 값을 반환하는 재귀함수 / 1이 되는 순간까지
import java.util.Scanner;

public class recursion_untill_1 {
  public static int count = 0;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(be_a_moment(n));
  }

  private static int be_a_moment(int n) {
    if(n == 1)
      return count;
    else if(n%2 == 0){
      count++;
      // System.out.println("짝수 : " + count);
      // System.out.println("n의 값 : " + n);
      return be_a_moment(n/2);
    }
    else
      count++;
      // System.out.println("홀수 : " + count);
      // System.out.println("n의 값 : " + n);
      return be_a_moment(n/3);
  }
}
