import java.util.Scanner;

class change_value{
  int value;
  public change_value(int value){
    this.value = value;
  }
}

public class call_by_value_call_by_reference_change_two_int{
  public static void swap(change_value n, change_value m){
    int temp = n.value;
    n.value = m.value;
    m.value = temp;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    change_value n = new change_value(sc.nextInt());
    change_value m = new change_value(sc.nextInt());

    swap(n, m);

    System.out.println(n.value + " " + m.value);

  }
}