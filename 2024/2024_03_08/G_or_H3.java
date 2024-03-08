import java.util.Scanner;

public class G_or_H3 {
    public static final int max_n = 100;
    public static final int max_k = 10000;

    public static int[] position_array = new int[max_n];
    public static int[] real_position_array = new int[max_n];
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
    }
}
