// https://www.codetree.ai/missions/5/problems/convert-to-binary/description
// Notation / 2진수로 변환하기

import java.util.Scanner;

public class Notation_BinaryNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int digits[] = new int[30];

    int cnt = 0;

    while(true){
      if(n<2){
        digits[cnt++] = n;
        break;
      }
      digits[cnt++] = n%2;
      n /= 2;
    }
    for(int i=cnt-1; i>=0; i--){
      System.out.print(digits[i]);
    }
  }
}
