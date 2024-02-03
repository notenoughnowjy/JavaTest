import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sortarr{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }

    System.out.println("");
    Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    Arrays.sort(arr2, Collections.reverseOrder());
    for(int i=0; i<n; i++){
      System.out.print(arr2[i] + " ");
    }
  }
}