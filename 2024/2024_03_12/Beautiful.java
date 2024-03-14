import java.util.Arrays;
import java.util.Scanner;

public class Beautiful {
    public static final int max_number = 100;
    public static int[] numbers = new int[max_number];
    public static int[] specific_numbers = new int[max_number];
    public static int[] temp_numbers = new int[max_number];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int beautiful_number = scanner.nextInt();

//        numbers에 배열 값 입력
        for(int i=0; i<number; i++){
            numbers[i] = scanner.nextInt();
        }

//        아름다운 수열을 위한 수열 값 입력
        for(int i=0; i<beautiful_number; i++){
            specific_numbers[i] = scanner.nextInt();
        }

//        수엽 값 정렬
        Arrays.sort(specific_numbers, 0, beautiful_number);

        int result = 0;
        for(int i=0; i<=number - beautiful_number; i++){
            for(int j=0; j<beautiful_number; j++){
//                temp 배열에 특정 구간의 값 넣기
                temp_numbers[j] = numbers[i + j];
            }
//            temp배열 정렬하기
            Arrays.sort(temp_numbers, 0, beautiful_number);


            boolean issame = true;
            for(int j=0; j<beautiful_number; j++){
                if(temp_numbers[j] != specific_numbers[j]){
                    issame = false;
                    break;
                }
            }
            if(issame)
                result++;
        }
        System.out.println(result);
    }
}
