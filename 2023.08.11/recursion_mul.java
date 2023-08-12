// https://www.codetree.ai/missions/5/problems/least-common-multiple-using-recursive-function/description
// 값을 반환하는 재귀함수 . 재귀함수를 이용한 촤소공배수
import java.util.Scanner;

public class recursion_mul {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int arr[] = new int[n];

   for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
   }
   System.out.println(LCM(n, arr));
  }

  private static int LCM(int n, int[] arr) {
    return -1;
  }
}