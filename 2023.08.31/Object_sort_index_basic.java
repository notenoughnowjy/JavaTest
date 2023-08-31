// https://www.codetree.ai/missions/5/problems/line-up-students/introduction
// 객체 정렬시 index 멤버 변수의 필요성

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
  int number, kor, eng, math;

  public Student(int number, int kor, int eng, int math) {
    this.number = number;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  @Override
  public int compareTo(Student student) {
    return this.kor - student.kor;
  }
}
public class Object_sort_index_basic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int student_number = scanner.nextInt();

    Student students[] = new Student[student_number];

    for(int i=0; i<student_number; i++){
      int sequence_number = scanner.nextInt();
      int kor_score = scanner.nextInt();
      int eng_score = scanner.nextInt();
      int math_score = scanner.nextInt();

      students[i] = new Student(sequence_number, kor_score, eng_score, math_score);
    }
    Arrays.sort(students);

    for(int i=0; i<student_number; i++){
      System.out.println(i+1 + " " + students[i].number);
    }
  }
}
