import java.util.Scanner;
public class test {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if(y % 4 != 0){
      System.out.println("false");
    }
    if(y % 100 != 0){
      System.out.println("true");
    }
    if(y % 400 == 0){
      System.out.println("true");
    }
    
      System.out.println("false");

  }
}