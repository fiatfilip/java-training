package code._4_student_effort;


class Pair<T extends Shoe>{
    private T first;
    private T second;
    public Pair(T firstElement,T secondElement){
        this.first=firstElement;
        this.second=secondElement;
        check(first,second);
    }
    public T getFirst(){
        return this.first;
    }
    public T getSecond(){
        return this.second;
    }
    private void check(T first,T second){
        if (first.getClass()!=second.getClass()) throw new PairsDoesntMatch("Different types of shoes!");
        else if(first.getSize()!=second.getSize()) throw new SizesDoNotMathc("Different size!");
        else if(first.getColor().equals(second.getColor())) System.out.println("Pairs ok!");
        else throw new ColorDoesntMatch("Different color!");
    }
}
class PairsDoesntMatch extends RuntimeException {
    PairsDoesntMatch(String s){super(s);}
}

class SizesDoNotMathc extends RuntimeException{
    SizesDoNotMathc(String s){super(s);}
}

class ColorDoesntMatch extends RuntimeException{
    ColorDoesntMatch(String s){super(s);}
}

interface Shoe{
    int getSize();
    String getColor();
}

class Running implements Shoe{
    int size;
    String color;
    public Running(String c,int s){
        this.size=s;
        this.color=c;
    }

    public int getSize(){
        return this.size;
    }
    public String getColor(){
        return this.color;
    }

}

class Heels implements Shoe{
    int size;
    String color;
    public Heels(String c,int s){
        this.size=s;
        this.color=c;
    }
    public int getSize(){
        return this.size;
    }
    public String getColor(){
        return this.color;
    }
}

class Boot implements Shoe{
    int size;
    String color;
    public Boot(String c,int s){
        this.size=s;
        this.color=c;
    }
    public int getSize(){
        return this.size;
    }
    public String getColor(){
        return this.color;
    }
}

public class PairMain {
    public static void main(String[] args){
        Running runningShoe1=new Running("RED",41);
        Running runningShoe2=new Running("RED",41);
        Pair<Running> pairOK=new Pair<>(runningShoe1,runningShoe2);

        Boot bottShoe=new Boot("Black",45);
        //  Pair<Running> pairKO=new Pair<>(runningShoe1,bottShoe);
        Running rsh1=new Running("Red",41);
        Running rsh2=new Running("Red",42);
        //    Pair<Running> pair2=new Pair<>(rsh1,rsh2);

        Boot bsh1=new Boot("Black",41);
        Boot bsh2=new Boot("White",41);
        Pair<Boot> pair3=new Pair<>(bsh1,bsh2);
    }
}
