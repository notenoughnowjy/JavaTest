// https://www.codetree.ai/missions/5/problems/area-been-to-and-from2/description
// 왔다 갔던 구역 2

import java.util.Scanner;
public class paint_section_come_and_go_should_resolve {
  public static int Max_N = 2000;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    // 시작지점 잡기 vs 매번 인덱스에 1000 더하기
    int position[] = new int[Max_N+1];
    int location = 1000;
    int temp = location;

    for(int i=0; i<n; i++){
      int movement = scanner.nextInt();
      String direction = scanner.next();

      if(direction.equals("R")){
        temp += movement;
        if(location > temp){
          for(int j=location; j<temp; j++){
            position[j]++;
            location = temp;
          }
        }
        if(location < temp){
          for(int j=location; j>temp; j--){
            position[j]++;
            location = temp;
          }
        }
      }

      if(direction.equals("L")){
        temp -= movement;
        if(location > temp){
          for(int j=location; j<temp; j++){
            position[j]++;
            location = temp;
          }
        }
        if(location < temp){
          for(int j=location; j>temp; j--){
            position[j]++;
            location = temp;
          }
        }
      }
    }

    int count = 0;
    for(int i=0; i<position.length; i++){
      if(position[i] >= 2){
        count++;
      }
    }
    System.out.println(count);
  }
}
