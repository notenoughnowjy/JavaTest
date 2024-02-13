import java.util.Scanner;

public class Oncheckboard {
    static final int max_R_and_C = 15;
    static int result = 0;
    static char arr[][] = new char[max_R_and_C + 1][max_R_and_C + 1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();

        for(int i=1; i<=R; i++){
            for(int j=1; j<=C; j++){
                arr[i][j] = scanner.next().charAt(0);
            }
        }

        char currentColor = arr[1][1];
        for(int i=1; i<=R; i++) {
            for(int j=i+1; j<R; j++){
                for(int k=1; k<=C; k++){
                    for(int l=k+1; l<C; l++){
                        // 주어진 규칙에 따라 점프하여 경우의 수 세기
                        if(currentColor != arr[i][k] && arr[i][k] != arr[j][l] && arr[j][l] != arr[R][C])
                            result++;
                    } // 반복문 4
                } // 반복문 3
            } // 반복문 2
        } // 반복문 1

        System.out.println(result);
    }
}
