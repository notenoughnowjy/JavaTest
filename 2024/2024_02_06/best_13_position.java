import java.util.Scanner;

public class best_13_position {
    static int max_n = 20;
    static int arr[][] = new int[max_n][max_n];
    static int result = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n-2; j++){
                result = Math.max(result, (arr[i][j] + arr[i][j+1] + arr[i][j+2]));
            }
        }
        System.out.println(result);
    }
}
