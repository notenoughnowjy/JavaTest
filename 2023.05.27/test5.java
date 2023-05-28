import java.util.Scanner;
import java.util.Arrays;

// 학생들의 정보를 나타내는 클래스 선언
class Student implements Comparable<Student>{
    String name;
    int height;
    int weight;

    public Student(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student) {
        // 키가 작으면 정렬 했을 때 앞에 와야 합니다.
        if(height != student.height)
            return height - student.height;
        // 몸무게가 크면 정렬 했을 때 앞에 와야 합니다.
        return student.weight - weight;
    }
};

public class test5 {
    public static final int MAXN = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] students = new Student[MAXN];

        for (int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Student 객체를 생성해 리스트에 추가합니다.
            students[i] = new Student(name, height, weight);
        }

        // custom comparator를 활용한 정렬
        Arrays.sort(students, 0, n);

        // 결과를 출력합니다.
        for (int i = 0; i < n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].height + " ");
            System.out.println(students[i].weight);
        }
    }
}