import java.util.Scanner;

class Product{
  String productname;
  int productcode;

  public Product(String productname, int productcode) {
    this.productname = productname;
    this.productcode = productcode;
  }
}

public class Obeject_productcode {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    Product product = new Product("codetree", 50);
    Product product2 = new Product(sc.next(), sc.nextInt());
    System.out.println("product " + product.productcode + " is " + product.productname);
    System.out.println("product " + product2.productcode + " is " + product2.productname);
  }
}
