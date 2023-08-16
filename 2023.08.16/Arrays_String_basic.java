import java.util.Arrays;

public class Arrays_String_basic{
  public static void main(String[] args) {
    String str = "badc";
    char[] chars = str.toCharArray(); // String으로 char 배열로 정렬
    Arrays.sort(chars); // 문자열 정렬
    String sortedStr = new String(chars); // String으로 변환
    // 출력
    System.out.println(sortedStr);
  }
}
