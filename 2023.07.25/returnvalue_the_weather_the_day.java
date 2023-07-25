import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class returnvalue_the_weather_the_day{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Y = sc.nextInt();
    int M = sc.nextInt();
    int D = sc.nextInt();

    True_Date_Weather(Y, M, D);
  }

  private static void True_Date_Weather(int y, int m, int d) {
    try{
      LocalDate Date = LocalDate.of(y, m, d);
      if(m>=3 && m<=5)
        System.out.println("Spring");
      else if(m>=6 && m<=8)
        System.out.println("Summer");
      else if(m>=9 && m<=11)
        System.out.println("Fall");
      else{
        System.out.println("Winter");
      }
    }
    catch(DateTimeException e){
      System.out.println("-1");
    }
  }
}