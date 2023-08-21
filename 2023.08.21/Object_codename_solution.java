import java.util.Scanner;

// User 정보를 나타내는 클래스 선언
class User {
    char codeName;
    int score;

    public User(char codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
};

public class Object_codename_solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = 5;
        User[] users = new User[n];
        for(int i = 0; i < n; i++) {
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            
            // 객체 생성 및 리스트에 추가
            users[i] = new User(codeName, score);
        }
        
        // 최소 점수를 갖는 요원 찾기
        int minIdx = 0;
        for(int i = 1; i < n; i++) {
            if(users[minIdx].score > users[i].score)
                minIdx = i;
        }

        // 결과를 출력합니다.
        System.out.println(users[minIdx].codeName + " " + users[minIdx].score);
    }
}