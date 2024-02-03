import java.util.ArrayList;

public class Genericspolymorphism{
  public static void main(String[] args){
    ArrayList<Sports> arrList = new ArrayList<Sports>();
        arrList.add(new Sports());
        arrList.add(new Soccer());
        arrList.add(new Baseball());
        
        Sports sports = arrList.get(0);
        Soccer soccer = (Soccer) arrList.get(1);
  }
}

class Sports{}

class Soccer extends Sports{}

class Baseball extends Sports{}