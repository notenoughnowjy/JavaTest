import java.util.Scanner;

public class output22{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // n값 입력받기
    int[] arr = new int[n]; // 배열

    for(int i=0; i<n; i++){ // 값 입력받기, 값 제곱하기
      arr[i] = sc.nextInt();
      arr[i] *= arr[i];
    }
    for(int i=0; i<n; i++){ // 출력
      System.out.print(arr[i] + " ");
    }
  }
}