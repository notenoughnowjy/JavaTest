/*
자리 수 단위로 완전탐색 / 일렬로 서있는 소 2

N마리의 소가 x = 1부터 x = N까지 순서대로 서 있습니다. 각 소의 키는 Ai이며,
첫 번째 위치에 놓여 있는 소의 키는 A1입니다. 3마리의 서로 다른 소의 위치를 (i, j, k)라고 했을 때,
i < j < k를 만족하며 동시에 Ai <= Aj <= Ak를 만족하는 서로 다른 쌍의 수를 구하는 프로그램을 작성해보세요.

입력:
5
3 1 7 10 4

출력:
2
 */

import java.util.Scanner;

public class cow_one_way {
    static int Max_N = 100;
    static int arr[] = new int[Max_N + 1];
    static int result = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=1; i<=n; i++){
            if(i==(n-1)) // 예외 처리 - 종료 조건
                break;
            for(int j=i+1; j<=n; j++){
                for(int k=j+1; k<=n; k++){
                    if(arr[i] <= arr[j] && arr[j] <= arr[k] && arr[i] <= arr[k]){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
