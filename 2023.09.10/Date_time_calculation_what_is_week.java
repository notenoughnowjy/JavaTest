// https://www.codetree.ai/missions/5/problems/the-day-of-the-day/description
// 날짜와 시간 계산 / 그 요일은
import java.util.Scanner;

public class Date_time_calculation_what_is_week{
  public static int[] num_of_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static String[] week = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; // length = 7
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int m1 = scanner.nextInt();
    int d1 = scanner.nextInt();

    int m2 = scanner.nextInt();
    int d2 = scanner.nextInt();

    int day_diff = day_diff_calculate(m2, d2) - day_diff_calculate(m1, d1);

    
  }
  private static int day_diff_calculate(int month, int day) {
    int diff = 0;
    
    for(int i=0; i<month; i++){
      diff += num_of_days[i];
    }
    diff += day;
    return diff + 1;
  }
}