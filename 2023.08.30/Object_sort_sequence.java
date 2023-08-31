// https://www.codetree.ai/missions/5/problems/korean-english-math-order/description
// 객체 정렬 / 국영수 순이지
import java.util.Arrays;
import java.util.Scanner;

class Subject implements Comparable<Subject>{
    String name;
    int kor, eng, math;

    public Subject(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Subject subject){
        if(this.kor != subject.kor)
            return subject.kor - this.kor;
        if(this.eng != subject.eng)
            return subject.eng - this.eng;
        return subject.math - this.math;
    }
}

public class Object_sort_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();

        Subject subject[] = new Subject[student];
        for(int i=0; i<student; i++){
            String student_name = sc.next();
            int kor_score = sc.nextInt();
            int eng_score = sc.nextInt();
            int math_score = sc.nextInt();

            subject[i] = new Subject(student_name, kor_score, eng_score, math_score);
        }

        Arrays.sort(subject);

        for(int i = 0; i < student; i++){
            System.out.println(subject[i].name + " " + subject[i].kor + " " + subject[i].eng + " " + subject[i].math);
        }
    }
}
