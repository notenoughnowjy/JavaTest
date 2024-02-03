// https://www.codetree.ai/missions/5/problems/where-live/submissions
// 객체 / 사는 지역
import java.util.Scanner;

class Area{
  String name, street_address, region;

  public Area(String name, String street_address, String region) {
    this.name = name;
    this.street_address = street_address;
    this.region = region;
  }
}
public class Object_livearea {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Area area[] = new Area[n];
    for(int i=0; i<n; i++){
      area[i] = new Area(sc.next(), sc.next(), sc.next()); // (name, address, region)
    }
    int last_index = 0;
    for(int i=0; i<n; i++){
      if(area[i].name.compareTo(area[last_index].name)>0){
        last_index = i;
      }
    }
    System.out.println("name " + area[last_index].name);
    System.out.println("addr " + area[last_index].street_address);
    System.out.println("city " + area[last_index].region);
  }
}
