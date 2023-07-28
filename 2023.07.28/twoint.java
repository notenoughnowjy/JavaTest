import java.util.Scanner;

class change_value{
  int value;
  public change_value(int value){
    this.value = value;
  }
public int getValue(){
  return value;
}
}

public class twoint{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    change_value a = new change_value(sc.nextInt());
    change_value b = new change_value(sc.nextInt());

    compare(a, b);
    System.out.println(a.value + " " + b.value);
  }
  public static boolean bigger(change_value a, change_value b){
    if(a.getValue() > b.getValue()){
      return true;
    }
    return false;
  }

  public static void compare(change_value c, change_value d) {
    if(bigger(c, d)){
      d.value += 10;
      c.value *= 2;
    } else{
      d.value *= 2;
      c.value += 10;      
    }
  }
}