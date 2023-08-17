// https://www.codetree.ai/missions/5/problems/determine-same-word/description
// 일반 정렬 / 순서를 바꾸었을 때  같은 단어인지 판별하기

import java.util.Arrays;
import java.util.Scanner;

public class general_sort_isequal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String string1 = sc.next();
    String string2 = sc.next();

    char c1[] = string1.toCharArray();
    char c2[] = string2.toCharArray();

    Arrays.sort(c1);
    Arrays.sort(c2);

    String str_result1 = new String(c1);
    String str_result2 = new String(c2);


    if(str_result1 == str_result2){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
