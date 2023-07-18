import java.util.Scanner;

public class minumumthreevalue {
  public static int minvalue;
  public static int min(int a, int b, int c){
    if(a<=b && a<=c)
      minvalue = a;
    if(b<=a && b<=c)
      minvalue = b;
    if(c<=a && c<=b)
      minvalue = c;
    return minvalue;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    min(num1, num2, num3);
    System.out.println(minvalue);
  }
}
