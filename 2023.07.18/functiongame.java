import java.util.Scanner;

public class functiongame{
  public static boolean contains369(int n){
    return n % 10 == 3 || n % 10 == 6 || n % 10 == 9 || n / 10 == 3 || n / 10 == 6 || n / 10 == 9;
  }
  public static boolean isthistrue(int n){
    return contains369(n) || n % 3 == 0;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for(int i=a; i<=b; i++){
      if(isthistrue(i)){
        count++;
      }
    }
    System.out.println(count);
  }
}