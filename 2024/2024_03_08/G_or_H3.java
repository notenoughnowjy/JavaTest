import java.util.Scanner;

public class G_or_H3 {
    public static final int max_n = 100;
    public static final int max_k = 10000;

    public static int[] position_array = new int[max_n];
    public static char[] real_position_array = new char[max_k+1];
    public static char[] score_char = new char[max_n];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for(int i=0; i<n; i++){
            position_array[i] = scanner.nextInt();
            score_char[i] = scanner.next().charAt(0);
        }

        for(int i=0; i<n; i++){
            real_position_array[position_array[i]] = score_char[i];
        }

        int result = 0;
        for(int i=0; i<=max_k-k; i++){
            int sum_char = 0;
            for(int j=i; j<=i+k; j++){
                if(real_position_array[j] == 'G')
                    sum_char += 1;
                if(real_position_array[j] == 'H')
                    sum_char += 2;
            }
            result = Math.max(result, sum_char);
        }
        System.out.println(result);
    }
}
