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