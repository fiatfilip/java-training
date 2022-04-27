package code._4_student_effort;

public class BoxingMatch {
    Fighter FighterOne;
    Fighter FighterTwo;
    BoxingMatch(Fighter one, Fighter two)
    {
        this.FighterOne=one;
        this.FighterTwo=two;
    }
    String fight(){
        String winner="Equal";
        while (FighterOne.getHealth()>0 && FighterTwo.getHealth()>0){
            FighterOne.attack(FighterTwo);
            FighterTwo.attack(FighterOne);
        }
        if (FighterOne.getHealth()>FighterTwo.getHealth()){
            winner=FighterOne.getName();
        }
        else{
            winner=FighterTwo.getName();
        }
        if (FighterOne.getHealth()== FighterTwo.getHealth()) {
            winner="Equal";
        }
        return winner;
    }
}
