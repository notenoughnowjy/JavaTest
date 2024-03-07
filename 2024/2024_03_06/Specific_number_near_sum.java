import java.util.Scanner;

public class Specific_number_near_sum {
    public static final int max_n = 100;
    public static int sum_and_specific_sub;
    public static int result = Integer.MAX_VALUE;
    public static int[] numbers = new int[max_n];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int specific_number = scanner.nextInt();

        for(int i=0; i<number; i++){
            numbers[i] = scanner.nextInt();
        }

        int array_sum = 0;
        for(int i=0; i<number; i++){
            array_sum += numbers[i];
        }

        for(int i=0; i<number; i++){
            for(int j=i+1; j<number; j++){
                sum_and_specific_sub = specific_number - (array_sum - numbers[i] - numbers[j]);

                if(min_sub(sum_and_specific_sub, result))
                    result = sum_and_specific_sub;
            }
        }
        System.out.println(Math.abs(result));
    }

    private static boolean min_sub(int sumAndSpecificSub, int pre_value) {
        sumAndSpecificSub = Math.abs(sumAndSpecificSub);
        pre_value = Math.abs(pre_value);
        return sumAndSpecificSub < pre_value;
    }
}
