/*
 * 값을 반환하는 함수 / 함수를 이용한 윤년 판별
 * boolean값으로 if문을 설정할 때 다음 if문으로 잘 넘어갈 조건을 설정해주는것이 중요해보인다.
 * 처음에 모든 조건을 문제에 쓰여진 대로 작성을 했더니 원하는 값이 나오지 않는 상황이 발생했다. 
 * 그 부분에 대해서는 추가적으로 공부가 필요해보인다.
 */
import java.util.Scanner;

public class functionleapyear {
  public static boolean leapyear(int y){
    if(y % 4 != 0)
      return false;
    if(y % 100 != 0)
      return true;
    if(y % 400 == 0)
      return true;

    return false;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if(leapyear(y))
      System.out.println("true");
    else
      System.out.println("false");
  }
}
