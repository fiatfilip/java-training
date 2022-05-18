package code._4_student_effort;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    Fighter(String name, int health,int dpa){
        this.name=name;
        this.health=health;
        this.damagePerAttack=dpa;
    }

    void attack(Fighter opponent){
        opponent.attacked(this.damagePerAttack);
    }

    void attacked(int damage){
        this.health=this.health-damage;
    }

    int getHealth(){
        return this.health;
    }
    String getName(){
        return this.name;
    }
}
