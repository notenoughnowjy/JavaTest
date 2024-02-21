import java.util.Scanner;

public class Omok_Should_Resolve {
    static int result = 0;
    static int winner_line_x;
    static int winner_line_y;
    static int nx, ny;
    static int count;
    //    (-1, -1) , (0, -1), (1, -1), (1, 0), (1, 1), (0, 1), (-1, 1), (-1, 0)
    static int dx[] = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
    static int dy[] = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};
    static boolean winner = false;
    static final int board_size = 19;
    static int omok_board[][] = new int[board_size][board_size];

    private static boolean inRange(int x, int y){
        return 0 <= x && x < board_size && 0 <= y && y < board_size;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<board_size; i++){
            for(int j=0; j<board_size; j++){
                omok_board[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<board_size; i++){
            for(int j=0; j<board_size; j++){
                if (omok_board[i][j] == 0)
                    continue;
                for(int k=0; k<dx.length; k++){
                    count = 1;
                    winner_line_x = i;
                    winner_line_y = j;
                    while (true) {
                        nx = winner_line_x + dx[k];
                        ny = winner_line_y + dy[k];

                        if(!inRange(nx, ny))
                            break;
                        if(omok_board[nx][ny] != omok_board[i][j])
                            break;
                        count++;
                        winner_line_x = nx;
                        winner_line_y = ny;
                    }
                    if(count == 5){
                        System.out.println(omok_board[i][j]);
                        System.out.print((i + 2 * dx[k] + 1) + " " + (j + 2 * dy[k] + 1));
                        System.exit(0);
                    }
                }
            }
        }
        System.out.print(0);
    }
}

