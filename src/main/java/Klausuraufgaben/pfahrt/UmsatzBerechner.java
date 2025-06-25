package Klausuraufgaben.pfahrt;

import java.util.List;

public class UmsatzBerechner {
    public double berechneGesamtumsatz(List<Fahrzeug> fahrzeuge) {
        double summe = 0;
        for (Fahrzeug f : fahrzeuge) {
            for (Fahrt ft : f.getFahrten()) {
                summe += f.berechneEntgelt(ft);
            }
        }
        return summe;
    }

    public double berechneElektroumsatz(List<Fahrzeug> fahrzeuge) {
        double summe = 0;
        for (Fahrzeug f : fahrzeuge) {
            if (f instanceof IElektroFahrzeug) {
                for (Fahrt ft : f.getFahrten()) {
                    summe += f.berechneEntgelt(ft);
                }
            }
        }
        return summe;
    }
}
