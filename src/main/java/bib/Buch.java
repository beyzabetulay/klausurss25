package bib;

public class Buch extends AMedienobject{
    String autor;
    public Buch(String autor){
        this.autor = autor;
    }
    @Override
    public void anzeigen(){
        System.out.println("Diese buch gehört "+autor);
    }
}
