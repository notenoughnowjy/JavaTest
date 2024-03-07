import java.util.Scanner;

public class Sum_of_range {
    public static final int max_n = 100;
    public static int result = 0;
    public static int[] numbers = new int[max_n];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for(int i=0; i<n; i++){
            numbers[i] = scanner.nextInt();
        }

        for(int i=0; i<=n-k; i++){
            int numbers_sum = 0;
            for(int j=i; j<i+k; j++){
                numbers_sum += numbers[j];
            }
            result = Math.max(result, numbers_sum);
        }
        System.out.println(result);
    }
}
