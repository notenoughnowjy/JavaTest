// https://www.codetree.ai/missions/5/problems/guess-day-of-week/description
// 날짜와 시간 계산 / 요일 맞추기
import java.util.Scanner;

public class Date_Time_Calculate_week_resolve{
  public static int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static String[] weeks = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int m1 = scanner.nextInt();
    int d1 = scanner.nextInt();
    
    int m2 = scanner.nextInt();
    int d2 = scanner.nextInt();

    int minus_of_day = Day_diif(m2, d2) - Day_diif(m1, d1);

    while(minus_of_day < 0){
      minus_of_day += 7;
    }

    System.out.println(weeks[(minus_of_day+1)%7]);
  }
  private static int Day_diif(int month, int day){
    int sum = 0;
    for(int i=0; i<month; i++){
      sum += num_of_days[i];
    }
    sum += day;
    return sum;
  }
}