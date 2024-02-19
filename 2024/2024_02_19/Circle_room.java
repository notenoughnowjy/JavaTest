import java.util.Scanner;

public class Circle_room {
    static int result = Integer.MAX_VALUE;
    static final int max_n = 1003;
    static int rooms[] = new int[max_n];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            rooms[i] = scanner.nextInt();
        }

        for(int i=0; i<n; i++){
            int temp = 0;
            for(int j=0; j<n; j++){
                temp += (rooms[j] * Math.abs(j - i));
            }
            result = Math.min(result, temp);
        }
        System.out.println(result);
    }
}
