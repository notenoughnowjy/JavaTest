import java.util.Scanner;

public class Two_nonadjacent_numbers {
    static int result = Integer.MIN_VALUE;
    static final int max_n = 100;
    static int arr[] = new int[max_n];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<n; i++){
            int temp = 0;
            if(i == n-2)
                break;
            for(int j=i+2; j<n; j++){
                temp = arr[i] + arr[j];
                result = Math.max(result, temp);
            }
        }
        System.out.println(result);
    }
}
