# JavaTest

JavaTest repository is studying for java and my testing code will upload

I'm Studing at https://www.codetree.ai/missions

## [2023.07.31]

<p>https://www.codetree.ai/missions/5/problems/find-the-location-of-a-substring-using-a-function/description<p>
이번 함수를 이용한 부분 문자열 위치 구하기에 대해서 풀어봄으로써 문자열에 관해서는 많이 부족하다는 것을 느꼈다. 최근 함수(메소드)를 통해서 프로그래밍 하는 것에 대해서는 실력이 많이 오르고 있다고 생각하고 있지만, 문자열에 대해서는 그다시 실력 향상이 느껴지지 않았다. 하지만 예전에 비해서는 나아진 것은 확실한 것 같다. 앞으로도 문자열 문제에 관련해서 많이 풀어봐야 겠다는 생각이 든다.

```java
// https://www.codetree.ai/missions/5/problems/find-the-location-of-a-substring-using-a-function/description
import java.util.Scanner;

public class function_part_String_position{
  public static String input;
  public static String Part_String;
  public static int result = -1;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    input = sc.next();
    Part_String = sc.next();

    for(int i=0; i<input.length(); i++){
      if(isTrue(i))
        System.out.println(i);
      else System.out.println(result);
    }
  }
  private static boolean isTrue(int input_index) {
    for(int i=0; i<Part_String.length(); i++){
      if(input.charAt(input_index) == Part_String.charAt(i)){
        return true;
      }
    }
    return false;
  }
}
```

## [2023.08.01]
- 재귀함수
<p>https://www.codetree.ai/missions/5/problems/to-output-numerically/introduction</p>
이 기본개념은 처음에는 이해되지 못했다. 하지만 재귀함수를 계속 호출함으로써 Stack에 쌓인 다음 종료조건을 만족한 후 Stack에서 출력되어 나온다는 것을 깨닫고는 이해하기 쉬웠다. 전공 지식의 중요성을 꺠달은 것 같은 느낌이었다.

```java

public class number_test{
  public static void main(String[] args) {

    int n = 3;

    printStar(n);
  }
  public static void printStar(int n) {
    if(n==0)
      return;
    
    printStar(n-1);
    for(int i=0; i<n; i++){
      System.out.print("*");
    }
    System.out.println();
  }
}
```
