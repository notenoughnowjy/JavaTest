// https://www.codetree.ai/missions/5/problems/convert-to-decimal/description
// 10진수로 변환하기
import java.util.Scanner;

public class Binary_to_decimal{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String binary = scanner.next();

    int num = 0;
    for(int i=0; i< binary.length(); i++){
      num = num * 2 + (binary.charAt(i)- '0');
    }

    System.out.println(num);

  }
}