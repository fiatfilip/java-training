package code._4_student_effort;

abstract class Animal{
    protected int legs;
    protected Animal(int legs){
        this.legs=legs;
    }
    abstract void eat();
    void walk(){
        System.out.println("Animal with "+this.getLegs()+" legs run");
    }
    public int getLegs() {
        return legs;
    }
}

class Spider extends Animal{
    protected Spider() {
        super(8);
    }
    void eat(){
        System.out.println("Spider eat");
    }
}

interface Pet{
    String getName();
    void setName(String name);
    void play();
}

class Cat extends Animal implements Pet{
    String name;
    Cat(String name){
        super(4);
        this.setName(name);
    }
    public Cat() {
        this("");
    }

    public void eat(){
        System.out.println("Cat eat");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void play(){
        System.out.println("Play with the Cat");
    }
}

class Fish extends Animal{
    Fish(){
        super(0);
    }
    void walk(){
        System.out.println("Fish can't walk!");
    }
    void eat(){
        System.out.println("Fish eat");
    }
}

public class animalHierarchy {
    public static void main(String[] args) {
        Fish d=new Fish();
        d.eat();
        d.walk();

        Cat c=new Cat("Fluffy");
        c.eat();
        c.walk();
        c.play();

        Animal a=new Fish();
        a.eat();
        a.walk();

        Animal e=new Spider();
        e.eat();
        e.walk();

        Pet p=new Cat();
        p.setName("Toby");
        System.out.print(p.getName());

    }
}
