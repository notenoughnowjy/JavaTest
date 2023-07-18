import java.util.Scanner;

public class functioncallanotherfunction{
  public static boolean returnvalue(int n){
    return n % 3 != 0 && diffnumber(n);
  }
  public static boolean diffnumber(int n){
    return (n/10) != (n%10);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int count = 0;
    for(int i=10; i<100; i++){
      if(returnvalue(i)){
        count++;
      }
    }
    System.out.println(count);
  }
}