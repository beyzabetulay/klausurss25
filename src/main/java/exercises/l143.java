package exercises;

public class l143 {
    String vorname;
    String nachname;
    Adresse adresse;

    public l143(String vorname, String nachname, Adresse adresse) {
        if(vorname.charAt(0) >= 'A' && vorname.charAt(0) <= 'Z'){
            this.vorname = vorname;
        }else{
            throw new RuntimeException("vorname muss mit einem großbuchstaben anfangen");
        }
        this.nachname = nachname;
        this.adresse = adresse;
    }

}
class Adresse {
    String strasse;
    String hausnummer;
    String ort;
    int plz;
    public Adresse(String str, String hausnummer, String ort, int plz) {
        if(str.charAt(0)>= 'A' && ort.charAt(0)>= 'A' && str.charAt(0)<= 'Z'&& ort.charAt(0)<= 'Z' ){
            this.strasse = str;
            this.ort = ort;
        }else {
            throw new RuntimeException(" strasse und ort müssen mit einem großen buchstaben anfangen");
        }if(hausnummer.charAt(0)>= 'A' && hausnummer.charAt(0)<= 'Z'){
                this.hausnummer = hausnummer;
            }else{
            throw new RuntimeException("hausnummer soll mit einem gorßbuchstaben anfangen");
        }
        this.plz =plz;


    }

}