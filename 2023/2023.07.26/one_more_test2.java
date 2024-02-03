import java.util.Scanner;

class change_value{
  int value;
  public change_value(int value){
    this.value = value;
  }
}

public class one_more_test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    change_value n = new change_value(sc.nextInt());
    change_value m = new change_value(sc.nextInt());

    swap(n, m);

    System.out.println("original n value:" + n.value);
    System.out.println("original m value:" + m.value);    
  }

  private static void swap(change_value n, change_value m) {
    int temp = n.value;
    n = new change_value(m.value);
    m = new change_value(temp);
    System.out.println("swap's n value:" + n.value);
    System.out.println("swap's m value:" + m.value);    
  }
}
