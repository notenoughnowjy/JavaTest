// https://www.codetree.ai/missions/5/problems/sequence-of-remainder-divided-by-100/description
// 값을 반환하는 재귀함수 / 재귀함수를 이용한 3n + 1 수열
import java.util.Scanner;

public class recursion_3n1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(recursion_sequence(n));
  }

  private static int recursion_sequence(int n){
    if(n == 1){
      return 0;
    }
    else if(n%2 == 0){
      return recursion_sequence(n/2) + 1;
    }
    else{
      return recursion_sequence(3*n+1) + 1;
    }
  }
}
