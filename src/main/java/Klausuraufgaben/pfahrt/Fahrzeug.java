package Klausuraufgaben.pfahrt;

import java.util.ArrayList;
import java.util.List;

public abstract class Fahrzeug {
    protected List<Fahrt> fahrten = new ArrayList<>();

    public void fuegeFahrtHinzu(Fahrt f) {
        fahrten.add(f);
    }

    public List<Fahrt> getFahrten() {
        return fahrten;
    }

    public abstract double berechneEntgelt(Fahrt f);
}
