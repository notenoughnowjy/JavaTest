import java.util.Scanner;

public class Specific_avg_should_resolve {
    public static final int max_n = 100;
    public static int result_cnt = 0;
    public static int[] numbers = new int[max_n];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            numbers[i] = scanner.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum_value = 0;
                int k_length = 0;
                for(int k=i; k<=j; k++){
                    sum_value += numbers[k];
//                    System.out.println(k_length);
                }
                double avg_value = (double) sum_value / (j - i + 1);

                boolean exists = false;
                for(int l=i; l<=j; l++) {
                    if (numbers[l] == avg_value) {
                        exists = true;
                    }
                }
                if(exists)
                    result_cnt++;
            }
        }
        System.out.println(result_cnt);
    }
}
