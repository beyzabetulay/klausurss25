package bib;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek{
    List<AMedienobject> obj;
    public Bibliothek(List<AMedienobject> obj){
        this.obj = obj;
    }

    public void zeigeAlle(){
        for (AMedienobject a:obj){
            String b =a.anzeigen();
            System.out.println(b);
        }
    }
    public static void main(String args[]){
        List<AMedienobject> dnm =new ArrayList<AMedienobject>();
        Bibliothek b1 = new Bibliothek(dnm);
        Buch k1 = new Buch("beyza");
        Buch k2 = new Buch("ceren");
        Dvd d1 = new Dvd(15);
        Dvd d2 = new Dvd(26);
        dnm.add(k1);
        dnm.add(k2);
        dnm.add(d1);
        dnm.add(d2);
        b1.zeigeAlle();
    }
}
