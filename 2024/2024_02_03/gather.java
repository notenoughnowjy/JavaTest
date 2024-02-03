// 모이자
/*
n개의 집이 x=1에서 x=n까지 순서대로 놓여있고, 각각 Aj명의 사람이 살고 있습니다. 이들은 회의를
위해 n개의 집 중 한 곳에 모이려고 합니다. 적절한 집을 선택하여 모든 사람들의 이동 거리의 합이 최소가 되도록
하는 프로그램을 작성해보세요.
 */

/*
입력:
5
1 2 3 2 6
 */

/*
출력:
16
 */

import java.util.Scanner;

public class gather {
  static int Max_N = 100;
  static int arr[] = new int[Max_N];
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    for(int i=0; i<n; i++)
      arr[i] = scanner.nextInt();


    int result = Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
      int distance = 0;

      for(int j=0; j<n; j++){
        distance += Math.abs(j-i) * arr[j];
      }

      result = Math.min(result, distance);
    }
    System.out.println(result);
  }
}
