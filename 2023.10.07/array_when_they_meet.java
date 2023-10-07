// https://www.codetree.ai/missions/5/problems/the-moment-we-meet/description
// 배열 기록 / 만나는 그 순간

import java.util.Scanner;

public class array_when_they_meet{
  public static int Max_N = 1000000;
  public static int timeA = 1, timeB = 1;
  public static int arrayA[] = new int[Max_N + 1];
  public static int arrayB[] = new int[Max_N + 1];
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Amove = scanner.nextInt();
    int Bmove = scanner.nextInt();

    for(int i=0; i<Amove; i++){
      String direction = scanner.next();
      int time = scanner.nextInt();

      for(int j=0; j<time; j++){
        if(direction.equals("R")){
          arrayA[timeA] = arrayA[timeA-1] + 1;
        }
        if(direction.equals("L")){
          arrayA[timeA] = arrayA[timeA-1] - 1;
        }
        
        timeA ++;
      }
    }

      for(int i=0; i<Bmove; i++){
        String direction = scanner.next();
        int time = scanner.nextInt();

        for(int j=0; j<time; j++){
          if(direction.equals("R")){
            arrayB[timeB] = arrayB[timeB-1] + 1;
          }
          if(direction.equals("L")){
            arrayB[timeB] = arrayB[timeB-1] - 1;
          }
          timeB ++;
        }
      }

    int result = -1;
    for(int i=1; i<timeB; i++){
      if(arrayA[i] == arrayB[i]){
        result = i;
        break;
      }
    }

    System.out.println(result);
    // for(int i=0; i<timeA; i++){
    //   System.out.print(arrayA[i] + " ");
    // }

    // System.out.println();

    // for(int i=0; i<timeB; i++){
    //   System.out.print(arrayB[i] + " ");
    // }
  }
}