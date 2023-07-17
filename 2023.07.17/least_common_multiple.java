import java.util.Scanner;

public class least_common_multiple{

  public static int LCMresult;
  public static void LCM(int n, int m){
    int GCDresult = GCD(n, m);

    LCMresult = (n * m) / GCDresult;
    
    System.out.println(LCMresult);
  }

  public static int GCD(int n, int m){
    int GCDresult = 1;
    int max = Math.max(n,m);

    for(int i=1; i<=max; i++){
      if(n % i == 0 && m % i == 0){
        GCDresult = i;
      }
    }
    return GCDresult;
  }

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    LCM(n, m);

  } 
}