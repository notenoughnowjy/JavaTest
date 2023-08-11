public class test {
  public void PrintName(){
    System.out.println("I'm Parent");
  }
  public static void main(String[] args) {
  }
}
public class test2 extends test{
  @Override
  public void PrintName(){
    System.out.println("I'm Child");
  }
}
// 어떻게 하는거지?
