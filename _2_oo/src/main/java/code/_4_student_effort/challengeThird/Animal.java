package code._4_student_effort.challengeThird;

public abstract class Animal {
    protected int legs;


    protected Animal(int legs) {
        this.legs = legs;
    }

     public abstract void eat();

    public void walk(){
        System.out.println("Animal walks using its " + legs + " legs.");
    }
}
