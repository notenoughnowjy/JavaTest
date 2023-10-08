// https://www.codetree.ai/missions/5/problems/who-will-pay/description
// 배열 기록 / 벌금은 누구에게
import java.util.Scanner;

public class array_record_who_fee{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int studentnumber = scanner.nextInt(); // 학생 수
    int totalpenaltyRound = scanner.nextInt(); // 벌칙을 정하는 횟수
    int criteria = scanner.nextInt(); // 벌금을 내는 횟수의 기준

    int studentsRecord[] = new int[studentnumber + 1];

    int result = -1;
    for(int i=0; i<totalpenaltyRound; i++){
      int penaltystudentnumber = scanner.nextInt();
      studentsRecord[penaltystudentnumber]++;
      if(studentsRecord[penaltystudentnumber] == criteria){
        result = penaltystudentnumber;
        break;
      }
    }
    System.out.println(result);
  }
}