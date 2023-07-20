import java.util.Scanner;

public class functioncontinuospart{
  public static int n1;
  public static int n2;
  public static int Max_N = 100;
  public static int[] A = new int[Max_N];
  public static int[] B = new int[Max_N];
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    n1 = sc.nextInt();
    n2 = sc.nextInt();



    for(int i=0; i<n1; i++){
      A[i] = sc.nextInt();
    }
    for(int i=0; i<n2; i++){
      B[i] = sc.nextInt();
    }

      if(isContinue()){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }


  }

  private static boolean isContinue() {
    for(int i=0; i<=n1-n2; i++){
      if(isSame(i)){
        return true;
      }
    }
    return false;
  }

  private static boolean isSame(int n){
    for(int i=0; i<n2; i++){
      if(A[i + n] != B[i]){
        return false;
      }
    }
    return true;
  }
}