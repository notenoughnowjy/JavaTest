import java.util.Scanner;

public class recursionflower {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    printStar(n);
  }

  private static void printStar(int n) {
    if(n == 0)
      return;
    System.out.print(n + " ");
    printStar(n-1);
    System.out.print(n + " ");
  }
}
