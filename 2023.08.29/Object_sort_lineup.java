// https://www.codetree.ai/missions/5/problems/line-up-students-2/description
// 객체 정렬 / 줄 세우기 2

import java.util.Scanner;

class Students{ // 학생 클래스
  int height, weight, number;

  public Students(int height, int weight, int number) {
    this.height = height;
    this.weight = weight;
    this.number = number;
  }
}
public class Object_sort_lineup{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Students students[] = new Students[n+1];

    for(int i=1; i<n+1; i++){
      students[i] = new Students(sc.nextInt(), sc.nextInt(), i);
    }
  }
}