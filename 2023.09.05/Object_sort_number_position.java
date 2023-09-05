import java.util.Arrays;
import java.util.Scanner;

class Number implements Comparable<Number>{
  int intNumber, position;

  public Number(int intNumber, int position) {
    this.intNumber = intNumber;
    this.position = position;
  }

  @Override
  public int compareTo(Number number) {
    if(this.intNumber != number.intNumber){
      // 오름차순 정렬
      return this.intNumber - number.intNumber;
    }
    return this.position - number.position;
  }
}
public class Object_sort_number_position{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int arr[] = new int[n+1];

    Number number[] = new Number[n];
    for(int i=0; i<n; i++){
      number[i] = new Number(scanner.nextInt(), i);
    }

    Arrays.sort(number);
    for(int i=0; i<n; i++){
      arr[number[i].position] = i+1;
    }

    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
  }
}