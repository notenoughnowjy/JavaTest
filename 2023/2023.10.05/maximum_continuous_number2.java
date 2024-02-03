// https://www.codetree.ai/missions/5/problems/continuous-number2/introduction
// 최장 연속 부분 수열 / 연속되는 수 2

import java.util.Scanner;

public class maximum_continuous_number2{
  public static int count, result;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int continuous_number[] = new int[n];

    for(int i=0; i<n; i++){
      continuous_number[i] = scanner.nextInt();
    }

    for(int i=0; i<n; i++){
      if(i >= 1 && continuous_number[i] == continuous_number[i-1]){
        count++;
      }
      else{
        count = 1;
      }

      result = Math.max(result, count);
      // System.out.println(count);
    }
    System.out.println(result);
  }
}