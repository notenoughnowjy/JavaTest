// https://www.codetree.ai/missions/5/problems/line-up-students/description
// 객체 정렬 / 줄 세우기

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
  int number, height, weight;

  public Student(int number, int height, int weight) {
    this.number = number;
    this.height = height;
    this.weight = weight;
  }
  @Override
  public int compareTo(Student student) {
    // 키가 크면 정렬 했을 때 앞으로(내림차순)
    if(this.height != student.height){
      return student.height - this.height;
    }
    // 몸무게가 크면 정렬 했을 때 앞으로(내림차순)
    if(this.weight != student.weight){
      return student.weight - this.weight;
    }
    // 번호가 작으면 앞으로(오름차순)
    return this.number - student.number;
  }

}

public class Object_sort_lineup_ {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int student_number = scanner.nextInt();

    Student students[] = new Student[student_number];

    for(int i=0; i<student_number; i++){
      int student_height = scanner.nextInt();
      int student_weight = scanner.nextInt();

      students[i] = new Student(i+1, student_height, student_weight);
    }
    Arrays.sort(students);

    for(int i=0; i<student_number; i++){
      System.out.println(students[i].height + " " + students[i].weight + " " + students[i].number);
    }
  }
}
