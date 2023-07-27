import java.util.Scanner;

public class modifyabs {
  private static void modify_abs(int n, int[] arr){
    for(int i=0; i<n; i++){
      arr[i] = Math.abs(arr[i]);
    }
    for(int i=0; i<n; i++){
      System.out.print(arr[i]);
      System.out.print(" ");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    modify_abs(n, arr);
  }
}
