import java.util.Scanner;

public class Date_Time_Calculatio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hour1 = scanner.nextInt();
    int minute1 = scanner.nextInt();
    int hour2 = scanner.nextInt();
    int minute2 = scanner.nextInt();

    int time1 = (hour1 * 60) + minute1;
    int time2 = (hour2 * 60) + minute2;
    System.out.println(time2 - time1);
  }
}
