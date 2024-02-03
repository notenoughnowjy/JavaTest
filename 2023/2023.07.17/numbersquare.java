import java.util.Scanner;

public class numbersquare{

  public static void Nvalue(int n){
    int count = 1;
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(count>9){
          count = 1;
        }
        System.out.print(count + " ");
        count++;
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Nvalue(n);
  }
}