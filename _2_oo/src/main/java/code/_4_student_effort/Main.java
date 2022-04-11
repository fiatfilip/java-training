package code._4_student_effort;

import code._4_student_effort.challengeFirst.BoxingMatch;
import code._4_student_effort.challengeFirst.Fighter;

public class Main {

  public static void main(String[] args) {
    // Code challenge 1
    Fighter fighter1 = new Fighter("John", 10000, 1);
    Fighter fighter2 = new Fighter("Dan", 100, 10);

    BoxingMatch boxingMatch1 = new BoxingMatch(fighter1, fighter2);
    System.out.println(boxingMatch1.fight());
  }
}
