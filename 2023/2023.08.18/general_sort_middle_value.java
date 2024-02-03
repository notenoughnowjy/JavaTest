import java.util.Arrays;
import java.util.Scanner;

public class general_sort_middle_value{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];
    int result_arr[] = new int[n/2+1];
    int cnt = 0;
    int order = 0;
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();

      Arrays.sort(arr, 0, i+1);
      cnt++;
      if(cnt%2 == 1){
        result_arr[order++] = arr[cnt/2];

        // System.out.println(cnt); // cnt 디버깅
        // System.out.println(order); // order 디버깅
      }
    }
    for(int i=0; i<result_arr.length; i++){
      System.out.print(result_arr[i] + " ");
    }
  }
}