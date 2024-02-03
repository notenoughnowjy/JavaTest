// https://www.codetree.ai/missions/5/problems/sort-by-height/description
// 객체 정렬 / 키를 기준으로 정렬
import java.util.Arrays;
import java.util.Scanner;

class Person{
  String name;
  int height, weight;

  public Person(String name, int height, int weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }
}
public class Object_sort_height {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Person person[] = new Person[n];
    
    for(int i=0; i<n; i++){
      String Personname = sc.next();
      int Personheight = sc.nextInt();
      int Personweight = sc.nextInt();

      person[i] = new Person(Personname, Personheight, Personweight);
    }
    Arrays.sort(person, (a,b) -> a.height - b.height);

    for(int i=0; i<n; i++){
      System.out.println(person[i].name + " " + person[i].height + " " + person[i].weight);
    }
  }
}
