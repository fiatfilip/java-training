package code._4_student_effort;

public class Film {
    Integer anAparitie;
    String nume;
    Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }
    public Film(Film aux){
        this.anAparitie=aux.getAnAparitie();
        this.nume=aux.getNume();
        this.actori=aux.getActori();
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }
    public int getNrOfActors(){
        return this.actori.length;
    }
    public Actor getActor(int index){
        return this.actori[index];
    }

}
