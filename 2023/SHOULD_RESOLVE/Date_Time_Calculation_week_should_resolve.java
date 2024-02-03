// https://www.codetree.ai/missions/5/problems/guess-day-of-week/description
// 날짜와 시간 계산 / 요일 맞추기

import java.util.Scanner;

public class Date_Time_Calculation_week_should_resolve{
  public static int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static String[] week = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}; // length = 7
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m1 = scanner.nextInt();
    int d1 = scanner.nextInt();

    int m2 = scanner.nextInt();
    int d2 = scanner.nextInt();

    int day_diff_1 = calculateDaydiff(m1, d1) + 1;
    int day_diff_2 = calculateDaydiff(m2, d2) + 1;

    // System.out.println(day_diff_1);
    // System.out.println(day_diff_2);
    
    String result_week = whatisweek(day_diff_1, day_diff_2);

    System.out.println(result_week);
  }
  private static String whatisweek(int day_diff_1, int day_diff_2) {
    int week_number = day_diff_2 - day_diff_1;

    while(week_number<0){
      week_number += 7;
    }

    String week_return = week[week_number%7];

    return week_return;
  }
  
  private static int calculateDaydiff(int month, int day) {

    int day_sum = 0;
    for(int i=1; i<month; i++){
      day_sum += num_of_days[i];
    }
    day_sum += day;

    return day_sum;
  }
}