// 일반 정렬 / 2개씩 그룹짓기
// https://www.codetree.ai/missions/5/problems/group-of-pairs/description
import java.util.Arrays;
import java.util.Scanner;

public class general_sort_two_group {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int arr[] = new int[2*n];

    for(int i=0; i<2*n; i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    
    System.out.println(group_max_sum(n, arr));
  }
  private static int group_max_sum(int n, int arr[]){
    int result = 0;
    int sum;

    for(int i=0; i<2*n; i++){
      sum = arr[i] + arr[2*n-1-i];
      result = Math.max(result, sum);
    }

    return result;
  }
}
