import java.util.Scanner;

public class MarathonTaxi2 {
    static int N;
    static int Max_N = 100;
    static int X[] = new int[Max_N];
    static int Y[] = new int[Max_N];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        for(int i=0; i<N; i++){
            X[i] = scanner.nextInt();
            Y[i] = scanner.nextInt();
        }


        int result = Integer.MAX_VALUE;
        // 각 숫자를 한번씩 제거하기 총 반복횟수는 N-2번
        for(int i=1; i<N-1; i++){
            int distance = 0;
            int sub1_J = 0;

            for(int j=1; j<N; j++){
                if(i == j)
                    continue;
                distance += Math.abs(X[j] - X[sub1_J]) + Math.abs(Y[j] - Y[sub1_J]);
                sub1_J = j;
            } // 반복문 2
            result = Math.min(result, distance);
        } // 반복문 1
        System.out.println(result);
    }
}
