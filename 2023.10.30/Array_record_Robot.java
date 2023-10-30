// https://www.codetree.ai/missions/5/problems/robot-moving-from-side-to-side/description
// 배열 기록 / 좌우로 움직이는 로봇

import java.util.Scanner;

public class Array_record_Robot {
  private static int Max_N = 1000000;
  private static int A[] = new int[Max_N + 1];
  private static int B[] = new int[Max_N + 1];
  private static int count = 0, posA = 1, posB = 1;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    // A 로봇
    for(int i=0; i<n; i++){
      int t = scanner.nextInt();
      char d = scanner.next().charAt(0);

      while(t-- > 0){
        if(d == 'L'){
          A[posA] = A[posA - 1] - 1;
        }
        if(d == 'R'){
          A[posA] = A[posA - 1] + 1;
        }
        posA++;
      }
    }

    // B 로봇
    for(int i=0; i<m; i++){
      int t = scanner.nextInt();
      char d = scanner.next().charAt(0);

      while(t-- > 0){
        if(d == 'L'){
          B[posB] = B[posB - 1] - 1;
        }
        if(d == 'R'){
          B[posB] = B[posB - 1] + 1;
        }
        posB++;
      }
    }

    if(posA < posB) {
      for(int i = posA; i < posB; i++) {
          A[i] = A[i - 1];
      }
  }
  else if(posA > posB) {
      for(int i = posB; i < posA; i++) {
          B[i] = B[i - 1];
      }
  }

    int timeMax = 0;
    if(posA < posB)
      timeMax = posB;
    else
      timeMax = posA;

    for(int i=1; i<timeMax; i++){
      if(A[i] == B[i] && A[i-1] != B[i-1]){
        count++;
      }
    }
    System.out.println(count);
  }
}
