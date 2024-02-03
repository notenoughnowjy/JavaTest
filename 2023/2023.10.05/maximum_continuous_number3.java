// https://www.codetree.ai/missions/5/problems/continuous-number3/description
// 최장 연속 부분 수열 / 연속되는 수 3

import java.util.Scanner;

public class maximum_continuous_number3 {
  public static int count, result;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int numbers[] = new int[n];
    for(int i=0; i<n; i++){
      numbers[i] = scanner.nextInt();
    }

    for(int i=0; i<n; i++){
      if(i >= 1 && numbers[i] * numbers[i-1] > 0){
        count++;
      }
      else{
        count = 1;
      }
      result = Math.max(result, count);
    }
    System.out.println(result);
  }
}
