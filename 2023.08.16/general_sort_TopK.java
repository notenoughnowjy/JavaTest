// https://www.codetree.ai/missions/5/problems/kth-number/description
// 일반 정렬 / Top K 숫자 구하기
import java.util.Arrays;
import java.util.Scanner;

public class general_sort_TopK {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // n, k 입력
    int n = sc.nextInt();
    int k = sc.nextInt();

    // 배열 선언
    int arr[] = new int[n+1];

    // 배열 입력
    for(int i=1; i<=n; i++)
      arr[i] = sc.nextInt();

    // 배열 정렬
    Arrays.sort(arr);

    // 배열 출력
    System.out.println(arr[k]);
  }
}
