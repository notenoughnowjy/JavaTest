// https://www.codetree.ai/missions/5/problems/robot-moving-from-side-to-side/description
// 배열 기록 / 좌우로 움직이는 로봇

import java.util.Scanner;

public class Array_record_Robot {
  private static int Max_N = 1000000;
  private static int A[] = new int[Max_N];
  private static int B[] = new int[Max_N];
  private static int count, posA, posB = 0;
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

        }
        else if(d == 'R'){

        }
      }
    }

    // B 로봇
    for(int i=0; i<m; i++){
      int t = scanner.nextInt();
      char d = scanner.next().charAt(0);
      while(t-- > 0){
        if(d == 'L'){

        }
        else if(d == 'R'){
          
        }
      }
    }

    System.out.println(count);
  }
}
