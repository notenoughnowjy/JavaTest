// https://www.codetree.ai/missions/5/problems/sum-of-specific-intervals/description
// 특정 구간의 합

import java.util.Scanner;

public class specially_part_sum{
  public static int Max_N = Integer.MAX_VALUE;
  public static int[] arr = new int[200];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    for(int i=1; i<=n; i++){
      arr[i] = sc.nextInt();
    }

    for(int i=0; i<m; i++){
      int a1 = sc.nextInt();
      int a2 = sc.nextInt();
      int sum = 0;
      for(int j=a1; j<=a2; j++){
        sum += arr[j];
      }
      System.out.println(sum);
    }
  }
}