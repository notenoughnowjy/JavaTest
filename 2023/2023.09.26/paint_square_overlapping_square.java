// https://www.codetree.ai/missions/5/problems/continuously-overlapping-squares/description
// 사각형 칠하기 / 계속 중첩되는 사각형

import java.util.Scanner;

public class paint_square_overlapping_square{
  public static int result_blue_square_area;
  public static int x1, x2, y1, y2;
  public static int OFFSET = 1000;
  public static int squares[][] = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    // All square's line is 3
    for(int i=0; i<=OFFSET * 2; i++){
      for(int j=0; j<=OFFSET * 2; j++){
        squares[i][j] = 3;
      }
    }

    // fill square 0 || 1
    for(int i=1; i<=n; i++){
      x1 = scanner.nextInt();
      y1 = scanner.nextInt();
      x2 = scanner.nextInt();
      y2 = scanner.nextInt();

      x1 += OFFSET;
      y1 += OFFSET;
      x2 += OFFSET;
      y2 += OFFSET;

      for(int j=x1; j<x2; j++){
        for(int k=y1; k<y2; k++){
          squares[j][k] = i%2;
        }
      }
    }


    // count blue square area
    for(int i=0; i<=2 * OFFSET; i++){
      for(int j=0; j<=2 * OFFSET; j++){
        if(squares[i][j] == 0){
          result_blue_square_area++;
        }
      }
    }
    // output
    System.out.println(result_blue_square_area);
  }
}
