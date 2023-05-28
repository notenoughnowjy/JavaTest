/*
 * 미래의 기상을 예측한 데이터 n개가 주어진다.
 * 각 데이터에는 요일, 날짜, 날씨의 정보가 순서대로 담겨있다.
 * 가장 근 시일내에 비가 오는 날을 찾아 출력하는 프로그램
 * 
 * 날짜 : yyyy-mm-dd String
 * 요일 : monday char
 * 날씨 : Sunny / Rain char
 * 
 * 4
 * 2036-12-27 Sun Snow
 * 2052-08-28 Wed Rain
 * 2043-03-21 Sat Sun
 * 2077-08-19 Thu Rain
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

class Rain{
 public String date;
 public String dayoftheweek;
 public String weather;
 
 public Rain(String date, String dayoftheweek, String weather){
  this.date = date;
  this.dayoftheweek = dayoftheweek;
  this.weather = weather;
 }
 public int compareTo(Rain rain){
  return Rain.date - this.date;
 }
}
public class test2{


  public static void main(String[] args){


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      String date = sc.next();String dayoftheweek = sc.next();String weather = sc.next();

      Rain r = new Rain(date, dayoftheweek, weather);

      String[] strArr = {
        r.date, r.dayoftheweek, r.weather
      };
      List<String> list = new ArrayList<>(Arrays.asList(strArr));


    }





  }
}
