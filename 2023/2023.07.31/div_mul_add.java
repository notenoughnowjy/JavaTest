// https://www.codetree.ai/missions/5/problems/divide-and-subtract-and-add-up/description
// 변수의 영역 / 나누고 뺴면서 합하기

import java.util.Scanner;

public class div_mul_add {
  public static int arr[];
  public static int m;
  public static int result;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    arr = new int[n+1];
    m = sc.nextInt();

    for(int i=1; i<=n; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(d_m_a());
  }

  public static int d_m_a(){
    while(m >= 1){
      result += arr[m];
      if(m%2 == 1)
        m -= 1;
      else if(m%2 == 0)
        m /= 2;
    }
    return result;
  }
}
