import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Person(int t, int x, int y) {
    }
}
public class Object_sort_Personal_Infromation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int person_number = 5;
        Person people[] = new Person[person_number];

        for(int i=0; i<person_number; i++){
            String person_name = scanner.next();
            int height = scanner.nextInt();
            double weight = scanner.nextDouble();
            
            people[i] = new Person(person_name, height, weight);
        }

        Arrays.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person person1, Person person2) {
                return person1.name.compareTo(person2.name);
            }
        });

        System.out.println("name");
        for(int i=0; i<person_number; i++){
            System.out.print(people[i].name + " ");
            System.out.print(people[i].height + " ");
            System.out.print(people[i].weight);
            System.out.println();
        }
        System.out.println();

        Arrays.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person person1, Person person2) {
                return person2.height - person1.height;
            } 
        });

        System.out.println("height");
        for (int i = 0; i<person_number; i++){
            System.out.print(people[i].name + " ");
            System.out.print(people[i].height + " ");
            System.out.print(people[i].weight);
            System.out.println();
        }
    }
}