// https://www.codetree.ai/missions/5/problems/datetime-to-datetime/submissions
// 날짜와 시간 계산 / Datetime to DateTime
import java.util.Scanner;

public class Date_Time_Calculation_DateTime_to_DateTime {
  public static int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Day = scanner.nextInt();
    int Hour = scanner.nextInt();
    int Minute = scanner.nextInt();

    int result = calculateMin(Day, Hour, Minute);
    System.out.println(result);
  }


  public static int calculateMin(int day, int hour, int minute){
    int minu = ((day * 24 * 60) + (hour * 60) + minute) - ((11 * 24 * 60) + (11 * 60) + 11);
    if(minu<0)
      return -1;
    return minu;
  }
}
