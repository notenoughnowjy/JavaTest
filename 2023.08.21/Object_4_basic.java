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

public class Object_4_basic {
  public static void main(String[] args) {
    Student students[] = new Student[5];
    
    for(int i=0; i<5; i++){
      students[i] = new Student();
    }

      Student student3 = students[2];
      student3.eng = 80;
      System.out.println("student3의 성적 : " + student3.eng);
      System.out.println("student3의 성적 : " + student3.math);
      System.out.println("student3의 성적 : " + student3.kor);

      System.out.println(); 

      Student student1 = students[0];
      
      System.out.println("student1의 성적 : " + student1.eng);
      System.out.println("student1의 성적 : " + student1.math);
      System.out.println("student1의 성적 : " + student1.kor);
  }
}
