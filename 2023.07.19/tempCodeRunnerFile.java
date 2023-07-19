import java.util.Scanner;

public class functionleapyear {
  public static boolean leapyear(int y){
    if(y % 4 == 0)
      return true;
    else if(y % 4 == 0 && y % 100 == 0 && y % 400 == 0)
      return true;
    else if(y % 4 == 0 && y % 100 == 0)
      return false;
    else
      return false;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if(leapyear(y))
      System.out.println("true");
    else
      System.out.println("false");
  }
}
