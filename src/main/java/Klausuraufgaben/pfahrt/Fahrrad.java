package Klausuraufgaben.pfahrt;

public class Fahrrad extends Fahrzeug {
    @Override
    public double berechneEntgelt(Fahrt f) {
        return f.min * 0.125; // 12,5ct/dak
    }
}
