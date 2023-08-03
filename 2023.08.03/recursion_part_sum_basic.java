import java.util.Scanner;

public class recursion_part_sum_basic{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println(recursion(N));
  }

  public static int recursion(int n) {
    if(n<10)
      return n;
    return recursion(n/10) + (n%10);
    
  }
}