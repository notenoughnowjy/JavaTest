package twovaluefunction;

import java.util.Scanner;

public class twovaluefunction{
  public void printshape(int n, String value){
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        System.out.print(value);
      }
      System.out.println();
    }
  }

  public static int InserNumber(){
    Scanner IntScanner = new Scanner(System.in);
    int n = IntScanner.nextInt();
    return n;
  }

  public static String InserValue(){
    Scanner StringScanner = new Scanner(System.in) ;
    String value = StringScanner.next();
    return value;
  }
  public static void main(String[] args) {
    twovaluefunction obj = new twovaluefunction();
    int n = InserNumber();
    String value = InserValue();
    obj.printshape(n, value);
  }
}