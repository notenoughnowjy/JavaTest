/*
 * 
1. 타입의 안정성 : 의도하지 않은 타입의 객체가 저장되는 것을 막고, 다른 타입의 객체로 인한 타입 형태가 맞지 않아 발생하는 문제를 없애준다.
2. 불필요한 형변환을 줄여 코드의 간결함 : 타입을 미리 명시함으로써 다른 타입의 객체가 저장되지 않아 객체를 꺼내 사용할 시 형변환을 통한 타입을 맞출 필요가 없어 코드를 간결하게 줄일 수 있다.

 */
import java.util.ArrayList;
import java.util.List;

public class Generics{
  public static void main(String[] args){
    ArrayList<String> arrList = new ArrayList<String>();

    arrList.add("박지성");
    arrList.add("손흥민");
    arrList.add("기성용");

    for(int i=0; i<arrList.size();i++){
      System.out.println("arrList : " + arrList.get(i));
    }

    List<Integer> list = new ArrayList<Integer>();
    list.add(123);
    list.add(456);
    list.add(789);

    for(int i=0; i<arrList.size();i++){
      System.out.println("List : " + list.get(i));
    }
  }
}