// https://www.codetree.ai/missions/5/problems/compare-total-points/description
// 객체 정렬 / 총점 비교

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
  String name;
  int subject1, subject2, subject3;

  public Student(String name, int subject1, int subject2, int subject3) {
    this.name = name;
    this.subject1 = subject1;
    this.subject2 = subject2;
    this.subject3 = subject3;
  }
  @Override
  public int compareTo(Student student) {
    return (this.subject1 + this.subject2 + this.subject3) - (student.subject1 + student.subject2 + student.subject3);
  }
}
public class Object_sort_sum {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int student_number = scanner.nextInt();
    
    Student students[] = new Student[student_number];

    for(int i=0; i<student_number; i++){
      String student_name = scanner.next();
      int subject1_score = scanner.nextInt();
      int subject2_score = scanner.nextInt();
      int subject3_score = scanner.nextInt();

      students[i] = new Student(student_name, subject1_score, subject2_score, subject3_score);
    }

    Arrays.sort(students);

    for(int i=0; i<student_number; i++){
      System.out.println(students[i].name + " " + students[i].subject1 + " " + students[i].subject2 + " " + students[i].subject3);
    }
  }
}
