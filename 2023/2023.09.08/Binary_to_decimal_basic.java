import java.util.Scanner;

public class Binary_to_decimal_basic{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int binary[] = new int[n];
    int num = 0;

    for(int i=0; i<n; i++){
      binary[i] = scanner.nextInt();
    }
    
    for(int i=0; i<n; i++){
      num = num * 2 + binary[i];
    }

    System.out.println(num);

  }
}