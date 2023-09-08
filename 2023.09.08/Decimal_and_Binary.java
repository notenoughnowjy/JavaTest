// https://www.codetree.ai/missions/5/problems/decimal-and-binary-number-2/description
// 십진수와 이진수 2

import java.util.Scanner;

public class Decimal_and_Binary {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String binary = scanner.next(); // 2진수 값 받기

    // 2진수를 10진수로 변환
    int decimal = 0;
    for(int i=0; i<binary.length(); i++){
      decimal = decimal * 2 + (binary.charAt(i) - '0');
    }

    decimal *= 17; // 십진수 결과 값 * 17
    // System.out.println(decimal); // 결과값 테스트

    int decimal_to_binary = decimal;

    int reesult[] = new int[20];

    int cnt = 0;
    while(true){
      if(decimal_to_binary < 2){
        reesult[cnt++] = decimal_to_binary;
        break;
      }
      reesult[cnt++] = decimal_to_binary % 2;
      decimal_to_binary /= 2;
    }
    for(int i=cnt-1; i>=0; i--){
      System.out.print(reesult[i]);
    }
  }
}
