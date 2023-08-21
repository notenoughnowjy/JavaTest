class Student{
  int kor, eng, math;

  public Student(int kor, int eng, int math) {
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }
};

public class Object_3_basic {
  public static void main(String[] args) {
    Student[] students = new Student[]{
      new Student(0, 0, 0),// 첫 번째 학생
      new Student(0, 0, 0),// 두 번째 학생
      new Student(30, 40, 50),// 세 번째 학생
      new Student(0, 0, 0),// 네 번째 학생
      new Student(0, 0, 0),// 다섯 번째 학생
    };
    Student student = students[2];
    System.out.println(student.kor);
    System.out.println(student.eng);
    System.out.println(student.math);
    
  }
}
