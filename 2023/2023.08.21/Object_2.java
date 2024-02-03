class Student{
  int kor, eng, math;

  public Student(int kor, int eng, int math) {
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }
  public Student(){
    this.kor = 0;
    this.eng = 0;
    this.math = 0;
  }
}

public class Object_2 {
  public static void main(String[] args) {
    Student student = new Student();
    System.out.println("No_return_value : " + student.kor);
    System.out.println("No_return_value : " + student.eng);
    System.out.println("No_return_value : " + student.math);

    student.kor = 80;
    student.eng = 80;
    student.math = 80;
    System.out.println("return value : " + student.kor);
    System.out.println("return value : " + student.eng);
    System.out.println("return value : " + student.math);



  }
}
