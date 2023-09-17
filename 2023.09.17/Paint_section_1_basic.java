// https://www.codetree.ai/missions/5/problems/block-stacking-commands2/description
// 구간 칠하기 / 블럭쌓는 명령 2

import java.util.Scanner;

public class Paint_section_1_basic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // N과 K 입력
    int N = scanner.nextInt();
    int K = scanner.nextInt();

    // 배열 선언 0~K이므로 N+1
    int arr[] = new int[N+1];

    for(int i=1; i<=K; i++){
      // 시작 배열 값
      int start_idx = scanner.nextInt();
      // 끝 배열 값
      int end_idx = scanner.nextInt();
      // 값 올리기
      for(int j=start_idx; j<=end_idx; j++){
        arr[j]++;
      }
    }

    int result = 0;
    for(int i=0; i<=N; i++){
      // 최댓값 뽑기
      result = Math.max(result, arr[i]);
    }
    // 결과 출력
    System.out.println(result);
  }
}
