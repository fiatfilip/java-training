package code._4_student_effort;

import java.util.Arrays;

interface ObbservedSubject{
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObserver(String message);
}

interface Observer{
    void update(String message);
}

class Students implements Observer{
    String name;
    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void listenTo(Teacher  teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + this.name + " learned about " + message);
    }

}

class Teacher implements ObbservedSubject {
    Observer[] observers=new Observer[0];

    @Override
    public void register(Observer obj) {
        this.observers = Arrays.copyOf(this.observers, this.observers.length + 1);
        this.observers[this.observers.length - 1] = obj;
    }

    @Override
    public void unregister(Observer obj) {
        int index = -1;
        for (int i = 0; i < this.observers.length; i++) {
            if (this.observers[i].equals(obj)) {
                index = i;
                break;
            }
        }
        System.arraycopy(this.observers, index + 1, this.observers, index, this.observers.length - 1 - index);

    }

    @Override
    public void notifyObserver(String message) {
        for (int i = 0; i < this.observers.length; i++) {
            this.observers[i].update(message);
        }
    }
    public void teach(String topic){
        for(int i=0;i<this.observers.length;i++)
        {
            this.observers[i].update(topic);
        }
    }
}

public class ObserverMain {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Students s01=new Students("Popescu");
        Students s02=new Students("Ionescu");
        Students s03=new Students("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics=new String[]{"bascics","oo","design patterns"};

        for(int i=0;i<javaTopics.length;i++){
            teacher.teach(javaTopics[i]);
        }
    }
}
