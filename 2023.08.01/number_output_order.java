import java.util.Scanner;

public class number_output_order {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    ntoone(n);
    System.out.println();
    oneton(n);
  }


  private static void ntoone(int n) {
    int result = 0;
    if(n==0)
      return;
    ntoone(n-1);
    for(int i=1; i<=n; i++){
      result = i;
    }
    System.out.print(result + " ");
  }

  private static void oneton(int n) {
    int result = 0;
    if(n==0)
      return;
    for(int i=1; i<=n; i++){
      result = i;
    }
    System.out.print(result + " ");
    oneton(n-1);
  }
}
