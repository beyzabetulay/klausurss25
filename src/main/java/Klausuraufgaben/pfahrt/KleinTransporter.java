package Klausuraufgaben.pfahrt;

public class KleinTransporter extends Fahrzeug {
    @Override
    public double berechneEntgelt(Fahrt f) {
        if (f.min <= 60) {
            return f.km * 0.30; // 30ct/km
        } else {
            int extraMin = f.min - 60;
            return (f.km * 0.30) + (extraMin * 0.25); // km + fazla süre
        }
    }
}
