// https://www.codetree.ai/missions/5/problems/time-to-time/introduction
// 날짜와 시간 계산 / Time to Time basic

import java.util.Scanner;

public class Date_Time_Calulation_basic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hour = scanner.nextInt();
    int minute = scanner.nextInt();
    int elapsedTime = 0;

    while(true){
      if(hour == 4 && minute == 1)
      break;
      elapsedTime++;
      minute++;
      if(minute == 60){
        hour++;
        minute = 0;
      }
    }
    System.out.println(elapsedTime);
  }
}
