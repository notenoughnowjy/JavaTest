  // https://www.codetree.ai/missions/5/problems/sort-by-height-and-weight/description
  // 키, 몸무게를 기준으로 정렬
  import java.util.Arrays;
  import java.util.Scanner;

  class Person implements Comparable<Person>{
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
      this.name = name;
      this.height = height;
      this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
      if(person.height != this.height){
        return this.height - person.height;
      }
      return person.weight - this.weight;
    }
  }

  public class Object_sort_height_weight_sort{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int Person_number = scanner.nextInt();

      Person person[] = new Person[Person_number];
      for(int i=0; i<Person_number; i++){
        String person_name = scanner.next();
        int person_height = scanner.nextInt();
        int person_weight = scanner.nextInt();

        person[i] = new Person(person_name, person_height, person_weight);
      }
      Arrays.sort(person);

      for(int i=0; i<Person_number; i++){
        System.out.println(person[i].name + " " + person[i].height + " " + person[i]. weight);
      }
    }
  }