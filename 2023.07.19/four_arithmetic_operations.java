import java.util.Scanner;

public class four_arithmetic_operations {
  public static void add(int a, int c){
    System.out.println(a + " + " + c + " = " + (a+c));
  }
  public static void sub(int a, int c){
    System.out.println(a + " - " + c + " = " + (a-c));
  }
  public static void mul(int a, int c){
    System.out.println(a + " * " + c + " = " + (a*c));
  }
  public static void div(int a, int c){
    System.out.println(a + " / " + c + " = " + (a/c));
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String o = sc.next();
    int c = sc.nextInt();

    if(o.equals("+")){
      add(a, c);
    }
    else if(o.equals("*")){
      mul(a, c);
    }
    else if(o.equals("/")){
      div(a, c);
    }
    else if(o.equals("-")){
      sub(a, c);
    }
    else{
      System.out.println("False");
    }
    
  }
}
