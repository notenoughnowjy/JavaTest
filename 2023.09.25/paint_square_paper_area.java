// https://www.codetree.ai/missions/5/problems/the-total-area-of-colored-paper./description
// 사각형 칠하기 / 색종이의 총 넓이

import java.util.Scanner;

public class paint_square_paper_area {
  public static int OFFSET = 100;
  public static int count;
  public static int[][] coloredPaper = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for(int i=0; i<n; i++){
      int x1 = scanner.nextInt();
      int y1 = scanner.nextInt();

      x1 += 100;
      y1 += 100;

      int x2 = x1 + 8;
      int y2 = y1 + 8;
      
      for(int j=x1; j<x2; j++){
        for(int k=y1; k<y2; k++){
          coloredPaper[j][k] = 1;
        }
      }
    }
    for(int i=0; i <= OFFSET * 2; i++){
      for(int j=0; j <= OFFSET * 2; j++){
        if(coloredPaper[i][j] == 1){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
