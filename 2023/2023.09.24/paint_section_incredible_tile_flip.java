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
          // 왼쪽으로 이동하면서 흰색타일로 뒤집기
          while(movement-- > 0){
            color[location] = 1;
            if(movement > 0){
              location--;
            } 
          }
        }

        if(direction == 'R'){
          // 오른쪽으로 이동하면서 검은색 타일로 뒤집기
          while(movement-- > 0){
          color[location] = 2;
          if(movement > 0){
            location++;
          }
        }
      }
    }
    // 탐색하면서 검은색 타일과 흰색 타일 찾기
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
