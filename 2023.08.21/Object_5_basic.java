import java.util.Scanner;

class Student{
  int kor, eng, math;

  public Student(int kor, int eng, int math) {
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  public Student() {
    this.kor = 0;
    this.eng = 0;
    this.math = 0;
  }
}

public class Object_5_basic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    Student students[] = new Student[n+1];

    for(int i=1; i<n+1; i++){
      students[i] = new Student(sc.nextInt(), sc.nextInt(), sc.nextInt()); // kor, eng, math
    }

    Student student3 = students[3]; // 세 번째 학생
    System.out.println(student3.kor);
    System.out.println(student3.eng);
    System.out.println(student3.math);
  }
}
