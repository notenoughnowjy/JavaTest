import java.util.Scanner;

public class istrue_palindrome {
  public static boolean palindrome(String s){
    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) != s.charAt(s.length()-i-1)){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String str = sc.next().toLowerCase();
      
      if(palindrome(str)){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
      
  }
}
