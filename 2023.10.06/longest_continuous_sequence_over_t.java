  // https://www.codetree.ai/missions/5/problems/subsequence-above-t/description
  // 최장 연속 부분 수열 / T를 초과하는 연속 부분 수열

  import java.util.Scanner;

  public class longest_continuous_sequence_over_t{
    public static int count, result;
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt(); // 몇개의 수?
      int t = scanner.nextInt(); // 기준 정수

      int sequence[] = new int[n];
      for(int i=0; i<n; i++){
        sequence[i] = scanner.nextInt();
      }

      for(int i=0; i<n; i++){
        if(i >= 1 && sequence[i] > t){
          count++;
        }
        else{
          count = 0;
        }
        result = Math.max(result, count);
      }
      System.out.println(result);
    }
  }