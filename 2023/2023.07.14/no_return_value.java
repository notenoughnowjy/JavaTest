import java.util.Scanner;

public class no_return_value{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    printString(number);
  }
  
  public static void printString(int number){
  for(int index=0; index<number; index++){
    System.out.println("12345^&*()_");
  }
  }
}
