import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static int n;
  public static int A[] = new int[n];
  public static int B[] = new int[n];

  public static boolean equal(){

    for(int i=0;i<n;i++){
    if(A[i]!=B[i]){
      
    }  
    }
  }
  public static void main(String args[]){

    /*
     * 의사 코드
     * 1. A = [1,2,3] B = [3,1,2] -> true
     * 2. A = [1,2,5] b = [3,1,2] -> false
     * 3. 정수 n을 주어주고
     * 4. 같으면 yes, 다르면 no
     * 5. Array.sort()로 정렬 후 비교하면 편하겠다.
     */
    Scanner sc = new Scanner(System.in);
    
    n = sc.nextInt();
    
    for(int i=0;i<n;i++){
      A[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      B[i] = sc.nextInt();
    }
      
    
    
    Arrays.sort(A);
    Arrays.sort(B);

    if(equal()){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }




  }
}
