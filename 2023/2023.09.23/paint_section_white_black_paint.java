// https://www.codetree.ai/missions/5/problems/painting-white-black/description
// 구간 칠기 / 흰검 칠하기

import java.util.Scanner;

public class paint_section_white_black_paint{
  public static final int Max_N = 100000;
  public static int color[] = new int[Max_N * 2 + 1];
  public static int cnt_white[] = new int[Max_N * 2 + 1];
  public static int cnt_black[] = new int[Max_N * 2 + 1];
  public static int black, gray, white, n;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();

    int location = Max_N;
    for(int i=1; i<=n; i++){
      int movement = scanner.nextInt();
      char direction = scanner.next().charAt(0);

      if(direction == 'R'){
        // 오른쪽으로 검은색 칠하기
        while(movement-- > 0){
          color[location] = 2;
          cnt_black[location]++;
          if(movement > 0){
            location++;
          }
        }
      }

      if(direction == 'L'){
        // 왼쪽으로 흰색 칠하기
        while(movement-- > 0){
          color[location] = 1;
          cnt_white[location]++;
          if(movement > 0){
            location--;
          }
        }
      }
    }

    for(int i=0; i<=2 * Max_N; i++){
      if(cnt_black[i] >= 2 && cnt_white[i] >= 2){
        gray++;
      }
      else if(color[i] == 1){
        white++;
      }
      else if(color[i] == 2){
        black++;
      }
    }
    System.out.print(white + " " + black + " " + gray);
  }
}