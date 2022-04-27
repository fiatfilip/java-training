package code._4_student_effort;

public class Studio {
    String nume;
    Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }
    public int getNrOfFilms()
    {
        return this.filme.length;
    }
    public Film getFilm(int index){
        return this.filme[index];
    }
    public void SearchForActor(String nume){
        int nrFilms=this.getNrOfFilms();
        int ok=0;
        for(int i=0;i<nrFilms;i++)
        {
            Film Filmaux=new Film(this.getFilm(i));
            for(int k=0;k<Filmaux.getNrOfActors();k++)
            {
                Actor Actoraux=new Actor(Filmaux.getActor(k));
                if (Actoraux.getNume().equals(nume)) ok=1;

            }
        }
        if (ok==1) System.out.println(this.getNume());
    }
    public void SearchForOldActor(){
        int nrFilms=this.getNrOfFilms();
        int ok=0;
        for(int i=0;i<nrFilms;i++)
        {
            Film Filmaux=new Film(this.getFilm(i));
            for(int k=0;k<Filmaux.getNrOfActors();k++)
            {
                Actor Actoraux=new Actor(Filmaux.getActor(k));
                if (Actoraux.getVarsta()>50) ok=1;

            }
        }
        if (ok==1) System.out.println(this.getNume());
    }
}
