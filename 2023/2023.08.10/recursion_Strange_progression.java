import java.util.Scanner;

public class recursion_Strange_progression {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    System.out.println(strange_progression(n));
  }

  private static int strange_progression(int n) {
    if(n == 1)
      return 1;
    if(n == 2)
      return 2;
    return strange_progression(n/3) + strange_progression(n-1);
  }
}
