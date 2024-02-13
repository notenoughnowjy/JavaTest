import java.util.Scanner;

/*
자리 수 단위로 완전탐색 / 체크판위에서 2

R * C 크기의 직사각형의 각 칸이 W, B로 표현되어 있습니다. W는 하얀색으로, B는 검은색으로 칸이
채워져 있는것을 뜻합니다. 왼쪽 상단에서 출발하여 우측 하단으로 이동할 때, 특정 룰을 만족하면서
이동에 성공할 수 있는 경우의 수를 구하는 프로그램을 작성해보세요. 아래가 특정 룰입니다.

1. 이동은 항상 점프를 통해서만 가능합니다. 또, 점프 진행시 항상 현재 위치에 적혀있는 색과,
    점프한 이후의 칸에 적혀있는 색이 달라야만 합니다.
2.  점프 진행시 현재 위치에서 적어도 한칸 이상 오른쪽에 있는 위치이며 동시에 현재 위치에서 적어도
    한칸 이상 아래쪽에 있는 위치인 곳으로만 점프가 가능합니다.
3.  정확히 시작, 도착 지점을 제외하고 점프하며 도달한 위치가 정확히 2곳 뿐이어야 합니다.

입력:
5 5
W W W W W
W W W W W
W B W W W
W W W W W
W W W W B

출력:
2
 */

public class Oncheckboard {
    static final int max_R_and_C = 15;
    static int result = 0;
    static char arr[][] = new char[max_R_and_C + 1][max_R_and_C + 1];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();

        for(int i=1; i<=R; i++){
            for(int j=1; j<=C; j++){
                arr[i][j] = scanner.next().charAt(0);
            }
        }

        char currentColor = arr[1][1];
        for(int i=1; i<=R; i++) {
            for(int j=i+1; j<R; j++){
                for(int k=1; k<=C; k++){
                    for(int l=k+1; l<C; l++){
                        // 주어진 규칙에 따라 점프하여 경우의 수 세기
                        if(currentColor != arr[i][k] && arr[i][k] != arr[j][l] && arr[j][l] != arr[R][C])
                            result++;
                    } // 반복문 4
                } // 반복문 3
            } // 반복문 2
        } // 반복문 1

        System.out.println(result);
    }
}
