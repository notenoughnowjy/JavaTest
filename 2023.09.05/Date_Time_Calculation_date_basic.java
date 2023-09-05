import java.util.Scanner;

public class Date_Time_Calculation_date_basic{
  public static int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Month1 = scanner.nextInt();int Day1 = scanner.nextInt();
    int Month2 = scanner.nextInt();int Day2 = scanner.nextInt();

    int sum_day1 = sum(Month1, Day1);
    int sum_day2 = sum(Month2, Day2);

    int result = sum_day2 - sum_day1;

    System.out.println(result+1);

  }
  private static int sum(int month, int day) {
    int sum = 0;
    for(int i=1; i<month; i++){
      sum += num_of_days[i];
    }
    sum += day;

    return sum;
  }
}