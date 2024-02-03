// https://www.codetree.ai/missions/5/problems/code-name/description
// 객체 / 코드네임

import java.util.Scanner;

class Agent{
  String codename;
  int score;

  public Agent(String codename, int score) {
    this.codename = codename;
    this.score = score;
  }
}

public class Object_codename {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Agent agent[] = new Agent[5];

    Agent result_agent = new Agent(null, 101);
    for(int i=0; i<agent.length; i++){
      agent[i] = new Agent(sc.next(), sc.nextInt());
      if(agent[i].score<result_agent.score){
        result_agent = agent[i];
      }
    }
    System.out.println(result_agent.codename + " " + result_agent.score);
  }
}
