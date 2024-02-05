/*
자리 수 단위로 완전탐색 / 괄호 쌍 만들어주기 3

문자 '(', ')'로만 이루어진 문자열 A가 주어지면 그 문자열들 사이에서 여는 괄호와 닫는 괄호로 쌍을 이룰 수 있는 서로 다른 가지수를 구하는 프로그램을 작성해보세요. 단, 여는 괄호가 먼저 나와야 합니다.

즉, 다음과 같은 모양을 띄는 쌍의 수를 세야 합니다.
...(.....)....

입력:
)(()())

출력:
8

 */

import java.util.Scanner;

public class make_pair{
    static int result = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();


        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                for(int j=i+1; j<str.length(); j++){
                    if(str.charAt(j) == ')'){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}