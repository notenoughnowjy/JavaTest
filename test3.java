import java.util.Arrays;

class Student implements Comparable<Student>{
  int kor, eng, math, number;

  public Student(int kor, int eng, int math, int number){
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.number = number;
  }

  @Override
  public int compareTo(Student student){
    return student.kor - this.kor;
  }
};

public class test3 {
  public static void main(String[] args){

    Student[] students = new Student[]{
      new Student(90, 80, 90, 1),
      new Student(20, 80, 80, 2),
      new Student(90, 30, 60, 3),
      new Student(60, 10, 50, 4),
      new Student(80, 20, 10, 5)
    };

    Arrays.sort(students);

    for(int i=0; i<5; i++){
      System.out.println((i + 1) + "등: " + students[i].number + "번");
    }
  }
}
