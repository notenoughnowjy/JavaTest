import java.util.Scanner;

class change_value{
  int value;
  public change_value(int value){
    this.value = value;
  }
}


public class big_add_25_small_mul_2{

  private static void modify(change_value n, change_value m){
    if(n.value<m.value){
      n.value *= 2;
      m.value += 25;
    } else{
      n.value += 25;
      m.value *= 2;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    change_value n = new change_value(sc.nextInt());
    change_value m = new change_value(sc.nextInt());

    modify(n, m);
    
    System.out.println(n.value + " " + m.value);
  }
}
