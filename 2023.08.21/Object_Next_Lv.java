import java.util.Scanner;

class Account{
  String id;
  int Level;
  
  public Account(String id, int level) {
    this.id = id;
    Level = level;
  }

  public Account() {
    this.id = "codetree";
    Level = 10;
  }
}

public class Object_Next_Lv {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Account account = new Account();
    System.out.println("user " + account.id + " lv " + account.Level);

    account.id = sc.next();account.Level = sc.nextInt();
    System.out.println("user " + account.id + " lv " + account.Level);

  }
}
