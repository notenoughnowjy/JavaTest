import java.util.Scanner;

public class Avoid_carry2 {
    static final int max_n = 20;
    static int arr[] = new int[max_n];
    static int result = -1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] % 10000 + arr[j] % 10000 + arr[k] % 10000 >= 10000)
                        continue;
                    if(arr[i] % 1000 + arr[j] % 1000 + arr[k] % 1000 >= 1000)
                        continue;
                    if(arr[i] % 100 + arr[j] % 100 + arr[k] % 100 >= 100)
                        continue;
                    if(arr[i] % 10 + arr[j] % 10 + arr[k] % 10 >= 10)
                        continue;
                    else
                        result = Math.max(result, arr[i] + arr[j] + arr[k]);
                }
            }
        }
        System.out.println(result);
    }
}
