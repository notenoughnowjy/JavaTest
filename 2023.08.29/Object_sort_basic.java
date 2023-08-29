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
    if(this.kor > student.kor)
      return 1;
    if(this.kor < student.kor)
      return -1;
    return 0;

    // ==
    // return this.kor - student.kor;
  }


}


public class Object_sort_basic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Student student[] = new Student[n];

    for(int i=0; i<n; i++){
      student[i] = new Student(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    Arrays.sort(student);

    for(int i=0; i<n; i++){
      System.out.println(student[i].eng + " " + student[i].eng + " " + student[i].math);
    }
  }
}
