// https://www.codetree.ai/missions/5/problems/minimum-area-of-rectangle-to-cover-debris/description
// 사각형 칠하기 / 잔해물을 덮기 위한 사각형의 최소 넓이

import java.util.Scanner;

public class paint_square_covering_up_debris{
  public static final int OFFSET = 1000;
  public static int Max_x_index, Max_y_index;
  public static int Min_x_index = 2*OFFSET, Min_y_index = OFFSET * 2;
  public static int rectangle[][] = new int[OFFSET * 2 + 1][OFFSET * 2 + 1];
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // First Rectangle
    int rectangle_x1 = scanner.nextInt();
    int rectangle_y1 = scanner.nextInt();
    int rectangle_x2 = scanner.nextInt();
    int rectangle_y2 = scanner.nextInt();

    // Add OFFSET
    rectangle_x1 += OFFSET; 
    rectangle_y1 += OFFSET;
    rectangle_x2 += OFFSET;
    rectangle_y2 += OFFSET;



    for(int i=rectangle_x1; i<rectangle_x2; i++){
      for(int j=rectangle_y1; j<rectangle_y2; j++){
        rectangle[i][j] = 1;
      }
    }

    // Second Rectangle
    rectangle_x1 = scanner.nextInt();
    rectangle_y1 = scanner.nextInt();
    rectangle_x2 = scanner.nextInt();
    rectangle_y2 = scanner.nextInt();

    // Add OFFSET
    rectangle_x1 += OFFSET; 
    rectangle_y1 += OFFSET;
    rectangle_x2 += OFFSET;
    rectangle_y2 += OFFSET;


    for(int i=rectangle_x1; i<rectangle_x2; i++){
      for(int j=rectangle_y1; j<rectangle_y2; j++){
        rectangle[i][j] = 2;
      }
    }

    // Check existing the first rectangle 
    boolean firstrectangleExist = false;
    for(int x=0; x<=OFFSET * 2; x++){
      for(int y=0; y<=OFFSET * 2; y++){
        if(rectangle[x][y] == 1){
          firstrectangleExist = true;
          // insert value max value and min value
          Max_x_index = Math.max(Max_x_index, x);
          Min_x_index = Math.min(Min_x_index, x);
          Max_y_index = Math.max(Max_y_index, y);
          Min_y_index = Math.min(Min_y_index, y);
        }
      } 
    }

    int result_area;
    if(!firstrectangleExist){
      result_area = 0;
    }
    else{
      result_area = (Max_x_index - Min_x_index + 1) * (Max_y_index - Min_y_index + 1);
    }
    System.out.println(result_area);
  }
}