// https://www.codetree.ai/missions/5/problems/correlation-between-shaking-hands-and-infectious-diseases2/description
// 배열 기록 / 악수와 전염병의 상관관계 2

import java.util.Arrays;
import java.util.Scanner;

class Person implements Comparable<Person>{
  int time;
  int x;
  int y;

  public Person(int time, int x, int y){
    this.time = time;
    this.x = x;
    this.y = y;
  }

  public int compareTo(Person person){
    return time - person.time;
  }
};

public class Array_record_infectious_disease {
  private static int Max_N = 100;
  private static int N, K, P, T, t, x, y;
  private static int developer[] = new int[Max_N];
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt(); // N명의 개발자
    K = scanner.nextInt(); // K번의 감염
    P = scanner.nextInt(); // 최초 감염자 번호 P
    T = scanner.nextInt(); // 진행 횟수 T

    Person person[] = new Person[Max_N];
    for(int i=0; i<T; i++){
      t = scanner.nextInt();
      x = scanner.nextInt();
      y = scanner.nextInt();
      person[i] = new Person(t, x, y);
    }

    Arrays.sort(person, 0, t);

    
  }
}