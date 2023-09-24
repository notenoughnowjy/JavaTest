// https://www.codetree.ai/missions/5/problems/strange-flipping-tiles/description
// 구간 칠하기 / 신기한 타일 뒤집기

import java.util.Scanner;

public class paint_section_incredible_tile_flip {
  public static final int Max_N = 100000;
  public static int color[] = new int[Max_N * 2 + 1];
  public static int black, white;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int location = Max_N;
    for(int i=1; i<=n; i++){
      int movement = scanner.nextInt();
      char direction = scanner.next().charAt(0);

        if(direction == 'L'){
          while(movement-- > 0){
            color[location] = 1;
            if(location > 0){
              location--;
            } 
          }
        }

        if(direction == 'R'){
          while(movement-- > 0){
          color[location] = 2;
          if(location > 0){
            location++;
          }
        }
      }
    }
    for(int i=0; i <= 2 * Max_N; i++){
      if(color[i] == 1){
        white++;
      }
      if(color[i] == 2){
        black++;
      }
    }
    System.out.print(white + " " + black);
  }
}
