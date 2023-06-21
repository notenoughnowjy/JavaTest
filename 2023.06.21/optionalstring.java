/*
 * 부분 문자열의 개수
 * 
 * A와 B
 * 
 * B가 문자열 A의 부분 문자열로써 등장하는 횟수를 구하는 프로그램
 */

import java.util.Scanner;

public class optionalstring {
    public static int Max_N = 1000;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] allarr = new String[Max_N]; 
        String optionarr;
        int count = 0;

        for(int i=0; i<1000;i++){
            allarr[i] = sc.next();
        }
        // for(int i=0;i<2;i++){
        //     optionarr = sc.nextLine();
        // }

        // for(int i=0; i<allarr.length();i++){
        //     if()
        // }

        for(int i=0; i<Max_N; i+=){
            System.out.println(allarr[i]);;
        }
        
    }   
}
