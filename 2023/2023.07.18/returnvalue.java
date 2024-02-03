public class returnvalue {
  public static boolean isMagicNumber(int n){
    return n % 3 != 0 && n % 5 == 0; // true 조건 반환
  }
  public static void main(String[] args){
    int cnt = 0;
    for(int i=1; i<=100; i++){
      if(isMagicNumber(i))
        cnt++;
    }
    System.out.println(cnt);
  }
}
