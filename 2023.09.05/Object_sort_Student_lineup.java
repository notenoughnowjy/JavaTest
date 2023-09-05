// https://www.codetree.ai/missions/5/problems/line-up-students-2/description
// 객체 정렬 / 줄 세우기 2

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
  int height, weight, number;

  public Student(int height, int weight, int number) {
    this.height = height;
    this.weight = weight;
    this.number = number;
  }

  @Override
  public int compareTo(Student student) {
    if(this.height != student.height){
      // 키가 더 작은 학생이 앞 = 오름차순 정렬
      return this.height - student.height;
    }
    // 몸무게가 더 큰 학생이 앞 = 내림차순 정렬
    return student.weight - this.weight;
  }
}

public class Object_sort_Student_lineup {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int student_number = scanner.nextInt();
    Student student[] = new Student[student_number];

    for(int i=0; i<student_number; i++){
      student[i] = new Student(scanner.nextInt(), scanner.nextInt(), i+1);
    }
    Arrays.sort(student);

    for(int i=0; i<student_number; i++){
      System.out.println(student[i].height + " " + student[i].weight + " " + student[i].number);
    }
  }
}
