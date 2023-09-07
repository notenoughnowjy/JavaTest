// https://www.codetree.ai/missions/5/problems/convert-to-binary/introduction
// Notation / 2진수로 변환하기
public class Notation_2_basic {
  public static void main(String[] args) {
    int n = 29;
    int digits[] = new int[20];
    int cnt = 0;

    while(true){
      // 종료 조건 설정
      if(n<2){
        digits[cnt++] = n;
        break;
      }
      
      digits[cnt++] = n%2;
      n /= 2;
    }
    for(int i= cnt-1; i>=0; i--){
      System.out.println(digits[i]);
    }
  }
}
/*
 * 1
 * 1
 * 1
 * 0
 * 1
 */