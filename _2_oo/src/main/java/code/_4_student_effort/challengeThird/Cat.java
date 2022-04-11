package code._4_student_effort.challengeThird;

public class Cat extends Animal implements Pet{
    private String name;


    @Override
    public void eat() {
        System.out.println("Cat " + name + "eats mouses");
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
        System.out.println("Cats " + name + " play with mouses");
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }
}
