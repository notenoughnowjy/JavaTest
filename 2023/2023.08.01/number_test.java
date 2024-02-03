public class number_test{
  public static void main(String[] args) {

    int n = 3;

    printStar(n);
  }
  public static void printStar(int n) {
    if(n==0)
      return;
    
    printStar(n-1);
    for(int i=0; i<n; i++){
      System.out.print("*");
    }
    System.out.println();
  }
}