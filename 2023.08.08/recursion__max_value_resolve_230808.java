import java.util.Scanner;

public class recursion__max_value_resolve_230808 {
  public static int Max_n = 100;
  public static int arr[] = new int[Max_n];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<n; i++)
      arr[i] = sc.nextInt();
    System.out.println(maxvalue(n));
  }

  private static int maxvalue(int n) {
    if(n == 0)
      return arr[0];
    return Math.max(maxvalue(n-1), arr[n]);
  }
}
