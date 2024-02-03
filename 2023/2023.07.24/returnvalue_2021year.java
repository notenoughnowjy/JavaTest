import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class returnvalue_2021year{

private static void True_Date(int Month, int Day){
  
  try{
    LocalDate Date = LocalDate.of(2021, Month, Day);
    System.out.println("Yes");
  }
  catch(DateTimeException e){
    System.out.println("No");
  }
}
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int Month = scanner.nextInt();
    int Day = scanner.nextInt();

    True_Date(Month, Day);
  }
}