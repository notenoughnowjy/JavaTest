// https://www.codetree.ai/missions/5/problems/rainy-day/description
// 객체 / 비오는 날
import java.util.Scanner;

class Rain{
  String date, week, weather;

  public Rain(String date, String week, String weather) {
    this.date = date;
    this.week = week;
    this.weather = weather;
  }
}

public class Object_Rainy_day {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Rain rain[] = new Rain[n];
    Rain result_Rain[] = new Rain[n];

    int cnt = 0;
    for(int i=0; i<n; i++){
      rain[i] = new Rain(sc.next(), sc.next(), sc.next());
      if(rain[i].weather.equals("Rain")){
        result_Rain[cnt++] = rain[i];
        // System.out.println(result_Rain[i].weather + " " + result_Rain[i].date);
        // System.out.println(cnt);
      }
    }
    int recent_index = 0;
    for(int i=0; i<cnt; i++){
      if(result_Rain[i].date.compareTo(result_Rain[recent_index].date)<0){
        recent_index = i;
      }
    }
    System.out.println(result_Rain[recent_index].date + " " + result_Rain[recent_index].week + " " + result_Rain[recent_index].weather);
  }
}
