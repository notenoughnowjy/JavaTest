import java.util.Scanner;

public class Hidden_word2 {
    public static final int for_str_max_n_m = 100;
    public static final int for_char_max_n = 50;
    public static final int for_char_max_m = 50;
    public static int n, m;
    public static String str[] = new String[for_str_max_n_m];
    public static char aChar[][] = new char[for_char_max_n][for_char_max_m];
    public static int dirx[] = new int[]{1, 1, 1, -1, -1, -1, 0, 0};
    public static int diry[] = new int[]{-1, 0, 1, -1, 0, 1, -1, 1};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        for(int i=0; i<n; i++){
            str[i] = scanner.next();
        }

//        str을 char 배열로 옮기기
        for(int i=0; i<n; i++){
            int charat_num = 0;
            for(int j=0; j<m; j++){
                aChar[i][j] = str[i].charAt(charat_num);
                charat_num++;
            }
        }

        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(aChar[i][j] != 'L')
                    continue;
                for(int k=0; k<dirx.length; k++){
                    int curt = 1;
                    int curx = i;
                    int cury = j;
                    while (true){
                        int nx = curx + dirx[k];
                        int ny = cury + diry[k];
                        if(!RangeIndex(nx, ny))
                            break;
                        if(aChar[nx][ny] != 'E')
                            break;
                        curt++;
                        curx = nx;
                        cury = ny;
                    }
                    if(curt >= 3)
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static boolean RangeIndex(int now_x, int now_y){
        return 0 <= now_x && now_x < n && 0 <= now_y && now_y < m;
    }
}
