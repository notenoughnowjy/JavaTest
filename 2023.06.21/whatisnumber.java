/*
 * 특정 조건의 온전수 구하기
 * 
 * 1이상 n이하의 수 중 온전수를 출력
 * 
 * 온전수
 * - 2로 나누어 떨어지는 경우
 * - 일의 자리가 5인 경우
 * - 3으로 나누어 떨어지면서 9로는 나누어 떨어지지 않는 수
 * 
 * 1. 2로 나누었을때 나머지(%)가 0
 * 2. 1의 자리 = 5
 * 3. 3으로 나누어 떨어지면서 9로는 나누어 떨어지지 않는 수
 */

import java.util.Scanner;
public class whatisnumber {
    public static int Max_N = 200;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] arr = new int[Max_N];
        int result;

        for(int i=1; i<=n; i++){
            if(i%2==0 || i%10==5 || i%3==0 && i%9!=0){
                continue;
            }
            else{
                result = i;
            }
            System.out.print(result + " ");
        }
    }
}
