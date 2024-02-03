// https://www.codetree.ai/missions/5/problems/maximum-overlapped-points/description
//구간 칠기 / 최대로 겹치는 지점

import java.util.Scanner;

public class paint_section_maximum_overlapping_points{
  public static int Max_N = 101;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int arr[] = new int[Max_N];
    
    for(int i=0; i<n; i++){
      int x1 = scanner.nextInt();
      int x2 = scanner.nextInt();

      for(int j=x1; j<=x2; j++){
        arr[j]++;
      }
    }
    
    int result = 0;
    for(int i=0; i<arr.length; i++){
      result = Math.max(result, arr[i]);
    }
    System.out.println(result);
  }
}