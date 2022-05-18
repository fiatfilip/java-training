package code._4_student_effort;

import java.util.Arrays;

class Apartament{
    String location;
    int monthlyRentCost;
    Apartament(){
        this.location=null;
        monthlyRentCost=0;
    }
    Apartament(String location,int rentCost){
        this.location=location;
        this.monthlyRentCost=rentCost;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public void setMonthlyRentCost(int monthlyRentCost) {
        this.monthlyRentCost = monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}

class Student{
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {return money;}

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

class RealEstateAgentProxy{
    Apartament[] allApartaments=new Apartament[0];
    void represent(Apartament appartment)
    {
        this.allApartaments=Arrays.copyOf(this.allApartaments,this.allApartaments.length+1);
        this.allApartaments[this.allApartaments.length-1]=appartment;
    }
    Apartament rent(Student student){
        Apartament rentedApartament=new Apartament();
        String name=student.getName();
        if (name.charAt(0)!='p' && name.charAt(0)!='P'){
            for(int i=0;i<this.allApartaments.length;i++)
            {
                if (student.getMoney()>=this.allApartaments[i].getMonthlyRentCost())
                {
                    rentedApartament=allApartaments[i];
                    break;
                }
            }
        }

        return rentedApartament;
    }

}

public class Proxy {
    public static void main(String[] args) {
        Apartament app01=new Apartament("Crangasi01",300);
        Apartament app02=new Apartament("Crangasi01",600);
        Apartament app03=new Apartament("Crangasi01",350);
        Apartament app04=new Apartament("Crangasi01",400);
        Apartament app05=new Apartament("Crangasi01",200);

        RealEstateAgentProxy proxy=new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01=new Student("Ionescu",500);
        Student student02=new Student("Popescu",330);

        Apartament apartamentForStudent01=proxy.rent(student01);
        System.out.println(student01+" rented "+apartamentForStudent01);
        Apartament apartamentForStudent02=proxy.rent(student02);
        System.out.println(student02+" rented "+apartamentForStudent02);
    }
}
