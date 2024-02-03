import java.util.Scanner;

public class sumofonetoN {
  public static int sum = 0;
  public static int add(int n){
    for(int i=1; i<=n; i++){
      sum += i;
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int result = add(n)/10;
    System.out.println(result);
  }
}
