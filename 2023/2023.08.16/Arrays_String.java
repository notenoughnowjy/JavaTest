import java.util.Arrays;
import java.util.Scanner;

public class Arrays_String {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String string = sc.next();
    sc.close();
    char[] chars = string.toCharArray();
    Arrays.sort(chars);

    String str_result = new String(chars);
    System.out.println(str_result);
  }
}
