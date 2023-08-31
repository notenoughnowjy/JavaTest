import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
  int kor, eng, math;

  public Student(int kor, int eng, int math) {
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  @Override
  public int compareTo(Student student) {
    return (this.kor + this.eng + this.math) - (student.kor + student.eng + student.math);
  }
}
public class Object_sort_basic{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int student_number = scanner.nextInt();
    Student students[] = new Student[student_number];
    for(int i=0; i<student_number; i++){
      int kor_score = scanner.nextInt();
      int eng_score = scanner.nextInt();
      int math_score = scanner.nextInt();

      students[i] = new Student(kor_score, eng_score, math_score);
    }
    Arrays.sort(students);

    for(int i=0; i<student_number; i++){
      System.out.println(students[i].kor + " " + students[i].eng + " " + students[i].math);

    }
  }
}