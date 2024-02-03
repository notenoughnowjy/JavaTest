// https://www.codetree.ai/missions/5/problems/sum-of-large-numeric-digits/submissions
// 값을 반환하는 재귀함수 / 큰 숫자 자리수의 합
import java.util.Scanner;

public class recursion_sum_part {
  public static int arr[] = new int[3];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<3; i++)
      arr[i] = sc.nextInt();
    int mulvalue = 1;
    for(int i=0; i<3; i++){
      mulvalue *= arr[i];
      // System.out.println(mulvalue);
    }

    System.out.println(part_sum(mulvalue));
  }
  private static int part_sum(int mulvalue) {
    if(mulvalue<10)
      return mulvalue;
    return part_sum(mulvalue/10) + mulvalue%10;
  }
}
