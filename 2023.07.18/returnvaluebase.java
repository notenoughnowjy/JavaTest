import java.util.Scanner;

public class returnvaluebase {
  public static int eachaddvalue;
  public static boolean discrimination(int n){
    int eachaddvalue = (n/10) + (n%10);
    return n % 2 == 0 && eachaddvalue % 5 == 0;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(n>9 && n<100){
      if(discrimination(n)){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
  }
}
