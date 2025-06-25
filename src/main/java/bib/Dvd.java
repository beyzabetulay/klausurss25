package bib;

public class Dvd extends AMedienobject {
    int dauer;
    public Dvd(int dauer){
        this.dauer =dauer;
    }
    @Override
    public void anzeigen(){
         System.out.println("diese dvd dauert " + dauer +"minuten lange");
    }


}
