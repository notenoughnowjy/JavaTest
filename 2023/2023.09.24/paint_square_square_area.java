// https://www.codetree.ai/missions/5/problems/total-width-of-a-rectangle2/description
// 사각형 칠하기 / 사각형의 총 넓이 2

import java.util.Scanner;

public class paint_square_square_area {
  public static final int offset = 100;
  public static int square[][] = new int[offset * 2 + 1][offset * 2 + 1];
  public static int result_count;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for(int i=0; i<n; i++){
      // 값 입력 받기
      int x1 = scanner.nextInt();
      int y1 = scanner.nextInt();
      int x2 = scanner.nextInt();
      int y2 = scanner.nextInt();

      // 음수 대비하여 100더해서 위치값 설정해주기
      x1 += offset;
      y1 += offset;
      x2 += offset;
      y2 += offset;

      for(int j=x1; j<x2; j++){
        for(int k=y1; k<y2; k++){
          square[j][k] = 1;
        }
      }
    }
    
    for(int i=0; i<= 2 * offset; i++){
      for(int j=0; j<= 2 * offset; j++){
        if(square[i][j] == 1){
          result_count++;
        }
      }
    }
    // 출력
    System.out.println(result_count);
  }
}