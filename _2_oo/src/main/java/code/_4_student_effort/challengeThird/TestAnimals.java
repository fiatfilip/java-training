package code._4_student_effort.challengeThird;

public class TestAnimals {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();



        d.eat();
        d.play();
        d.walk();
        d.setName("Boss");
        System.out.println(d.getName());

        c.eat();
        c.play();
        c.walk();
        System.out.println(c.getName());

        a.eat();
        a.walk();


        e.walk();
        e.eat();


        p.play();
        System.out.println(p.getName());


    }
}
