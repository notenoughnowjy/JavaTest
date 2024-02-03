// https://www.codetree.ai/missions/5/problems/369-games-using-functions/description
// 값을 반환하는 함수 / 함수를 이용한 369 게임
import java.util.Scanner;

public class functiongame{
  public static boolean contains369(int n){
    while(n>0){
      if(n%10 == 3 || n % 10 == 6 || n % 10 == 9){
        return true;
      }
      n /= 10;
    }
    return false;
  }

  public static boolean isthistrue(int n){
    return contains369(n) || (n % 3 == 0);
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for(int i=a; i<=b; i++){
      if(isthistrue(i)){
        count++;
        // System.out.println(i);
      }
    }
    System.out.println(count);
  }
}