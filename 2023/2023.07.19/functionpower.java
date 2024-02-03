import java.util.Scanner;
public class functionpower {
  public static void power(int a, int b){
    int result = 1;
    for(int i=0;i<b;i++){
      result *= a;
    }
    System.out.println(result);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    power(a, b);
  }
}
