import java.util.Arrays;

class Student implements Comparable<Student> {
    int kor, eng, math;

    public Student(int kor, int eng, int math){
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        if(this.kor == student.kor)	     // 국어 점수가 일치한다면
            return this.eng - student.eng;  // 영어 점수를 기준으로 오름차순 정렬합니다.
        return this.kor - student.kor;      // 국어 점수가 다르다면, 오름차순 정렬합니다.
    }
};

public class Object_sort_sequence_basic {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student(90, 80, 90), // 첫 번째 학생
            new Student(20, 80, 80), // 두 번째 학생
            new Student(90, 30, 60), // 세 번째 학생
            new Student(60, 10, 50), // 네 번째 학생
            new Student(80, 20, 10)  // 다섯 번째 학생 
        };

        Arrays.sort(students);

        for(int i = 0; i < 5; i++)
            System.out.println(students[i].kor + " " + students[i].eng + " " + students[i].math);
    }
}