package Klausuraufgaben.pmusik;

public class MusikStueck {
    String titel;
    String interpret;
    int laenge; // in Sekunden

    public MusikStueck(String titel, String interpret, int laenge) {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }

    public String getTitel() {
        return titel;
    }

    public String getInterpret() {
        return interpret;
    }

    public int getLaenge() {
        return laenge;
    }

    @Override
    public String toString() {
        return titel + " von " + interpret + " (" + laenge + "s)";
    }
}
