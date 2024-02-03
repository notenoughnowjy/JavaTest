import java.util.Scanner;

public class discriminateprime{
  public static int Max_N = 100;
  public static boolean isPrime(int n){
    for(int i=2; i<n; i++){
      if(n%i == 0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int[] Primearr = new int[Max_N];
    int sum = 0;
    for(int i=a; i<=b; i++){
      if(isPrime(i)){
        Primearr[i] = i;
        sum += Primearr[i];

      }
    }
    System.out.println(sum);
  }
}