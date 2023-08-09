// https://www.codetree.ai/missions/5/problems/maximum-value-with-recursive-function/explanation
// 값을 반환하는 재귀함수 / 재귀함수를 이용한 최댓값
import java.util.Scanner;

public class recursion_max_value{
  public static int Max_N = 100;
  public static int[] arr = new int[Max_N];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<n; i++)
      arr[i] = sc.nextInt();
      System.out.println(recursion_maxvalue(n-1));
  }
  
  private static int recursion_maxvalue(int n){
    if(n == 0)
      return arr[0];
    return Math.max(recursion_maxvalue(n-1), arr[n]);
  }
}