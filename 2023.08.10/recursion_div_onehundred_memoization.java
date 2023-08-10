import java.util.Scanner;

public class recursion_div_onehundred_memoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] memo = new int[n + 1]; // 메모이제이션 배열 생성
        System.out.println(recursion_div(n, memo));
    }

    private static int recursion_div(int n, int[] memo) {
        if (n == 1) return 2;
        if (n == 2) return 4;
        
        // 이미 계산한 값이 메모에 저장되어 있는 경우 바로 반환
        if (memo[n] != 0) return memo[n];

        // 계산 후 메모에 저장
        memo[n] = (recursion_div(n - 1, memo) * recursion_div(n - 2, memo)) % 100;
        return memo[n];
    }
}
