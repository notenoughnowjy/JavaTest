import java.util.Scanner;

class Student{
  int kor, eng, math;
  
  public Student(int kor, int eng, int math) {
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }
}

public class Object{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Student student = new Student(sc.nextInt(), sc.nextInt(), sc.nextInt());
    Student student2 = new Student(80, 90, 100);

    System.out.println(student.eng + " " + student.kor + " " + student.math);
    System.out.println(student2.kor + " " + student2.eng + " " + student2.math);
  }
}