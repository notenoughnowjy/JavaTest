// https://www.codetree.ai/missions/5/problems/indices-of-sorted-array/submissions
// 객체 정렬 / 정렬된 숫자 위치 알아내기
import java.util.Arrays;
import java.util.Scanner;

class Number implements Comparable<Number>{
  int intnumber, sequence;

  public Number(int intnumber, int sequence) {
    this.intnumber = intnumber;
    this.sequence = sequence;
  }

  @Override
  public int compareTo(Number number) {
    if(this.intnumber != number.intnumber){
      return this.intnumber - number.intnumber;
    }
    return this.sequence - number.sequence;
  }
}
public class Object_sort_sorted_number_position {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Number number[] = new Number[n];
    int answer[] = new int[n];

    for(int i=0; i<n; i++){
      number[i] = new Number(scanner.nextInt(), i);
    }
    Arrays.sort(number);

    for(int i=0; i<n; i++){
      answer[number[i].sequence] = i+1;
    }

    for(int i=0; i<n; i++){
      System.out.print(answer[i] + " ");
    }
  }
}
