// https://www.codetree.ai/missions/5/problems/sorting-words/description
// 일반 정렬 / 단어 정렬

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_list_sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String string[] = new String[n];
    
    for(int i=0; i<n; i++){
      string[i] = sc.next();
    }
    Arrays.sort(string);

    for(int i=0; i<n; i++){
      System.out.println(string[i]);
    }
  }
}
