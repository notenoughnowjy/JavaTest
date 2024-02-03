// https://www.codetree.ai/missions/5/problems/painting-white-black/description
// 구간 칠기 / 흰검 칠하기

import java.util.Scanner;

public class paint_section_white_black {
  public static final int Max_K = 100000;
  public static int[] a = new int[2 * Max_K + 1];
  public static int[] cntB = new int[2 * Max_K + 1];
  public static int[] cntW = new int[2 * Max_K + 1];
  public static int b, w, g;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int cur = Max_K;
    for(int i=1; i<=n; i++){
      int x = scanner.nextInt();
      char c = scanner.next().charAt(0);
      if(c == 'L'){
        while(x-- > 0){
          a[cur] = 1;
          cntW[cur]++;
          if(x > 0) cur--;
        }
      }
      else{
        while(x-- > 0){
          a[cur] = 2;
          cntB[cur]++;
          if(x > 0) cur++;
        }
      }
    }
    for(int i=0; i<=2*Max_K; i++){
      if(cntB[i] >= 2 && cntW[i] >= 2) g++;
      else if(a[i] == 1) w++;
      else if(a[i] == 2) b++;
    }
    
    System.out.print(w + " " + b + " " + g);
  }
}
