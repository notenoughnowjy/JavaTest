import java.util.Scanner;

public class resultis {
  public static int value;
  public static int result_value;
  public static void result(int n, int m){
    int max = Math.max(n, m);
    for(int i=1; i<=max; i++){
      if(n%i==0 && m%i==0){
        value = i;
        result_value = Math.max(result_value, value);

      }
    }
    System.out.println(result_value);
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

  result(n, m);
  }
}
