import java.util.Scanner;

public class functionsumand{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    
    for(int i=a; i<=b; i++){
      if(issumpair(i) && isprime(i)){
        count++;
      }
    }
    System.out.println(count);
  }

  private static boolean isprime(int n) {
    for(int i=2; i<n; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }

  private static boolean issumpair(int n) {
    int pairsum = (n/10) + (n%10);
    if(pairsum%2 == 0){
      return true;
    }
    return false;
  }
}