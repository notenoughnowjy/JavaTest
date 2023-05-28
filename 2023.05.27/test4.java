import java.util.Arrays;
import java.util.Scanner;
/*
 * 줄 세우기
 * N명의 학생에 대해 키와 몸무게의 정보가 주어진다.
 * 규칙에 따라 정렬한다.
 * 1. 키가 더 큰 학생이 앞에 와야 한다.
 * 2. 키가 동일하다면, 몸무게가 더 큰 학생이 앞에 와야 한다.
 * 3. 키와 몸무게가 동일하다면, 번호가 작은 학생이 앞에 온다.
 * "우선 순위 -> 키 > 몸무게 > 번호"
 * 입력:
 * 5
 * lee 167 40
 * kim 148 32
 * park 161 53
 * choi 148 70
 * jung 148 45
 * 출력
 * choi 148 70
 * jung 148 45
 * kim 148 32
 * park 161 53
 * lee 167 40
 */
class Students implements Comparable<Students>{
  public String pn;
  public int ph; //personal height
  public int pw; //personal weight
  
  public Students(String pn, int ph, int pw){
    this.pn = pn;
    this.ph = ph;
    this.pw = pw;
  }

  public int compareTo(Students student){
    if(ph!=student.ph){
      return ph - student.ph;
    }
    return student.pw - pw;
  }
};
public class test4 {
  public static void main(String[] args){
    int Max_N = 100;
    Scanner sc = new Scanner(System.in);

    // 몇명의 학생 정보를 입력받을지 정한다.
    int n = sc.nextInt();
    Students[] students = new Students[Max_N];
    // n명의 학생들의 키와 몸무게를 입력받아야 한다.
    for(int i=0;i<n;i++){
      String pn = sc.next();
      int ph = sc.nextInt();
      int pw = sc.nextInt();

      students[i] = new Students(pn, ph, pw);
  }

  Arrays.sort(students,0,n);

  for(int i=0;i<n;i++){
    System.out.print(students[i].pn + " ");
    System.out.print(students[i].ph + " ");
    System.out.println(students[i].pw);
  }
}
}
