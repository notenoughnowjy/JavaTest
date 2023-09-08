import java.util.Scanner;

public class Different_number_of_fractional_transformations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt(); // 정수 number
  
    int B = scanner.nextInt(); // 바꿀 인수

    int result[] = new int[30];

    int cnt = 0;
    while(true){
      if(number < B){
        result[cnt++] = number;
        break;
      }
      result[cnt++] = number % B;
      number /= B;
    }
    for(int i=cnt-1; i>=0; i--){
      System.out.print(result[i]);
    }
  }
}
