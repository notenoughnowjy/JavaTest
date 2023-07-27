import java.util.Scanner;

public class morethantwoalp {
  public static int count = 0;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String string = sc.next().toLowerCase();
    isTrue(string);
  }

  private static void isTrue(String string) {
    for(int i=0; i<string.length(); i++){
      if(string.charAt(i) != string.charAt(0)){
        count++;
      }
    }
    if(count >= 2){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
