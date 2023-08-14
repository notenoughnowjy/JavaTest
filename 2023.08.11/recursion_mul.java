// https://www.codetree.ai/missions/5/problems/least-common-multiple-using-recursive-function/description
// 값을 반환하는 재귀함수 . 재귀함수를 이용한 촤소공배수
import java.util.Scanner;

public class recursion_mul {
    // 재귀 함수를 사용하여 최대공약수를 계산하는 함수
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // 재귀 함수를 사용하여 최소공배수를 계산하는 함수
    public static int lcm(int[] arr, int n, int index) {
        if (index == n - 1)
            return arr[index];
        
        return (arr[index] * lcm(arr, n, index + 1)) / gcd(arr[index], lcm(arr, n, index + 1));
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      int result = lcm(arr, n, 0); // 재귀함수를 호출하여 최소공배수 계산

      System.out.println(result);
    }
}
