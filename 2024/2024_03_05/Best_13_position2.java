import java.util.Scanner;

public class Best_13_position2 {
    public static int board_size, result, count1, count2, sum_of_cnt1_cnt2;
    public static final int max_n = 20;
    public static int[][] board = new int[max_n][max_n];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        보드 사이즈 입력
        board_size = scanner.nextInt();

//        보드에 값 입력
        for(int i=0; i<board_size; i++){
            for(int j=0; j<board_size; j++){
                board[i][j] = scanner.nextInt();
            }
        }

        result = 0;
        for(int i=0; i<board_size; i++){
            for(int j=0; j<board_size-2; j++){
                for(int k=0; k<board_size; k++){
                    for(int l=0; l<board_size-2; l++){
                        if(i==k && Math.abs(j-l) <= 2)
                            continue;

                        count1 = board[i][j] + board[i][j+1] + board[i][j+2];
                        count2 = board[k][l] + board[k][l+1] + board[k][l+2];
                        sum_of_cnt1_cnt2 = count1 + count2;
                        result = Math.max(result, sum_of_cnt1_cnt2);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
