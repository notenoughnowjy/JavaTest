import java.util.Scanner;

class change_value{
  int value;
  public change_value(int value){
    this.value = value;
  }
}

public class one_more_test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    change_value n = new change_value(sc.nextInt());
    change_value m = new change_value(sc.nextInt());

    swap(n, m);
    
    System.out.println(n.value + " " + m.value);
  }

  private static void swap(change_value n, change_value m) {
    int temp = n.value;
    n.value = m.value;
    m.value = temp;
  }
}
