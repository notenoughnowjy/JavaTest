  // 구간 칠하기 / 최대로 겹치는 구간
  // https://www.codetree.ai/missions/5/problems/maximum-overlapped-segments/description

  import java.util.Scanner;

  public class paint_section_II_basic {
    public static int Max_N = 201;
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();

      int arr[] = new int[201];
      int result = 0;
      for(int i=0; i<n; i++){
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        x1 += 100;
        x2 += 100;
        
        for(int j=x1; j<x2; j++){
          arr[j]++;
        }
      }
      for(int i=0; i<arr.length; i++){
        result = Math.max(result, arr[i]);
      }
      System.out.println(result);
    }
  }
