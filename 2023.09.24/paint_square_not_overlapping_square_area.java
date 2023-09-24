// https://www.codetree.ai/missions/5/problems/area-of-non-overlapping-rectangle/description
// 사각형 칠하기 / 겹치지 않는 사각형의 넓이

import java.util.Scanner;

public class paint_square_not_overlapping_square_area {
  public static final int OFFSET = 1000;
  public static int square[][] = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];
  public static int x1, x2, y1, y2;
  public static int result_count;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 직사각형 A, B = 1
    for(int i=0; i<2; i++){
      x1 = scanner.nextInt();
      y1 = scanner.nextInt();
      x2 = scanner.nextInt();
      y2 = scanner.nextInt();
      
      x1 = add(x1);
      x2 = add(x2);
      y1 = add(y1);
      y2 = add(y2);

      for(int j=x1; j<x2; j++){
        for(int k=y1; k<y2; k++){
          square[j][k] = 1;
        }
      }
    }
    // 직사각형 M = 2
    x1 = scanner.nextInt();
    y1 = scanner.nextInt();
    x2 = scanner.nextInt();
    y2 = scanner.nextInt();

      x1 = add(x1);
      x2 = add(x2);
      y1 = add(y1);
      y2 = add(y2);


    // Marking rectangle M - 2
      for(int i=x1; i<x2; i++){
        for(int j=y1; j<y2; j++){
          square[i][j] = 2;
        }
      }
      
      // count rectangle A and B for result
      for(int i=0; i<=OFFSET * 2; i++){
        for(int j=0; j<=OFFSET * 2; j++){
          if(square[i][j] == 1){
            result_count++;
          }
        }
      }
      // output the result
      System.out.println(result_count);
  }


  public static int add(int value){
    value += OFFSET;
    return value;
  }
}
