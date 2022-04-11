package code._4_student_effort.challengeFirst;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;


    public String fight(){
        String nameOfTheWinner;

//        if (fighter1.getHealth() > fighter2.getHealth() &&
//        fighter1.getDamagePerAttack() > fighter2.getDamagePerAttack()){
//            nameOfTheWinner = fighter1.getName();
//        } else if (fighter2.getHealth() > fighter1.getHealth() &&
//                fighter2.getDamagePerAttack() > fighter1.getDamagePerAttack()){
//            nameOfTheWinner = fighter2.getName();
//        } else if (fighter2.getHealth() == fighter1.getHealth() &&
//                fighter2.getDamagePerAttack() == fighter1.getDamagePerAttack()){
//            System.out.println("The battle is equal");
//        } else{
            int attacksToKillFighter1 = fighter1.getHealth() / fighter2.getDamagePerAttack();
            int attacksToKillFighter2 = fighter2.getHealth() / fighter1.getDamagePerAttack();
            if(attacksToKillFighter1 > attacksToKillFighter2){
                nameOfTheWinner = fighter1.getName();
        } else if(attacksToKillFighter1 < attacksToKillFighter2){
                nameOfTheWinner = fighter2.getName();
            } else{
                nameOfTheWinner= "Let's call in even, Congrats!";
            }

            return nameOfTheWinner;
    }

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }
}
