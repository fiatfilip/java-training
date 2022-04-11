package code._4_student_effort.challengeThird;

public class Fish extends Animal implements Pet{
    private String name;

    @Override
    public void eat() {
        System.out.println("Fish eats fitoplancton");
    }

    @Override
    public void walk(){
        System.out.println("Fish can't walk");
    }

    public Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish " + name + " is playing");
    }
}
