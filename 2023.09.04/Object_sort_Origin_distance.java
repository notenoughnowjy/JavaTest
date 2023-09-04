// https://www.codetree.ai/missions/5/problems/distance-from-origin/description
// 객체 정렬 / 원점으로부터의 거리

import java.util.Arrays;
import java.util.Scanner;

class Circle implements Comparable<Circle>{
  int x, y, distance, number;

  public Circle(int x, int y, int distance, int number) {
    this.x = x;
    this.y = y;
    this.distance = distance;
    this.number = number;
  }

  @Override
  public int compareTo(Circle circle) {
    return this.distance - circle.distance;
  }
}

public class Object_sort_Origin_distance {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Circle circle[] = new Circle[n];

    for(int i=0; i<n; i++){
      int circle_x = scanner.nextInt();
      int circle_y = scanner.nextInt();
      int circle_distance = Math.abs(0 - circle_x) + Math.abs(0 - circle_y);

      circle[i] = new Circle(circle_x, circle_y, circle_distance, i+1);
    }
    Arrays.sort(circle);

    for(int i=0; i<n; i++){
      System.out.println(circle[i].number);
    }
  }
}
