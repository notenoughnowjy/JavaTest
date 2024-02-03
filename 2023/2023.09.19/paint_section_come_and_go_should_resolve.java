// https://www.codetree.ai/missions/5/problems/area-been-to-and-from2/description
// 왔다 갔던 구역 2

import java.util.Scanner;
public class paint_section_come_and_go_should_resolve {
  public static final int location = 1000;
  public static final int Max_R = 2000;
  public static final int Max_N = 100;

  public static int[] x1 = new int[Max_N];
  public static int[] x2 = new int[Max_N];

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    // 시작지점 잡기 vs 매번 인덱스에 1000 더하기
    int position[] = new int[Max_R+1];

    int cur = 0;

    for(int i=0; i<n; i++){
      int distance = scanner.nextInt();
      char direction = scanner.next().charAt(0);

      if(direction == 'L'){
        x1[i] = cur - distance;
        x2[i] = cur;
        cur -= distance;
      }
      if(direction == 'R'){
        x1[i] = cur;
        x2[i] = cur + distance;
        cur += distance;
      }

      x1[i] += location;
      x2[i] += location;
    }

    for(int i=0; i<n; i++){
      for(int j=x1[i]; j<x2[i]; j++){
        position[j]++;
      }
    }
    int count = 0;
    for(int i=0; i<=Max_R; i++){
      if(position[i] >= 2){
        count++;
      }
    }
    System.out.println(count);
  }
}
