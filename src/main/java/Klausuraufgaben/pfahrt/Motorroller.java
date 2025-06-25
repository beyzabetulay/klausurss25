package Klausuraufgaben.pfahrt;

public class Motorroller extends Fahrzeug {
    @Override
    public double berechneEntgelt(Fahrt f) {
        return 3.0 + f.km * 0.15; // 3 EUR + 15ct/km
    }
}
