// https://www.codetree.ai/missions/5/problems/kth-special-string/submissions
// 일반 정렬 / k번째로 신기한 문자열
import java.util.Arrays;
import java.util.Scanner;

public class general_sort_k_magic {
  public static int Max_N = 100;
    public static String str[] = new String[Max_N];
    public static String result_str[] = new String[Max_N];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String t = sc.next();

    int cnt = 0;

    for(int i=0; i<n; i++){
      str[i] = sc.next();
      if(isTrue(str[i], t)){
        result_str[cnt++] = str[i];
      }
    }

    Arrays.sort(result_str, 0, cnt);

    System.out.println(result_str[k-1]);
  }

  private static boolean isTrue(String string, String t) {

    if(string.length() < t.length()){
      return false;
    }

    for(int i=0; i<t.length(); i++){
      if(string.charAt(i) != t.charAt(i)){
        return false;
      }
    }
    
    return true;
  }
}
