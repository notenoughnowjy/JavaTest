// https://www.codetree.ai/missions/5/problems/keep-the-lead/description
// 배열 기록 / 선두를 지켜라

import java.util.Scanner;

public class Array_record_protect{
  public static int Max_N = 1000000;
  public static int A[] = new int[Max_N + 1];
  public static int B[] = new int[Max_N + 1];
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int timeA = 1;
    for(int i=0; i<n; i++){
      int v = scanner.nextInt();
      int t = scanner.nextInt();

      while(t-- > 0 ){
        A[timeA] = A[timeA - 1] + v;
        timeA++;
      }
    }

    int timeB = 1;
    for(int i=0; i<m; i++){
      int v = scanner.nextInt();
      int t = scanner.nextInt();

      while(t-- > 0 ){
        B[timeB] = B[timeB - 1] + v;
        timeB++;
      }
    }
    int temp = 0;
    int result = 0;
    for(int i=1; i<timeA; i++){
      if(A[i] > B[i]){
        if(temp == 2){
          result++;
        }
        temp = 1;
      }
      if(A[i] < B[i]){
        if(temp == 1){
          result++;
        }
        temp = 2;
      }
    }
    for(int i=0; i<timeA; i++){
      System.out.print(A[i] + " "); 
    }
    System.out.println();
    for(int i=0; i<timeB; i++){
      System.out.print(B[i] + " "); 
    }
  }
}