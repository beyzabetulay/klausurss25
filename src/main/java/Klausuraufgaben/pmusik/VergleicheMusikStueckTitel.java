package Klausuraufgaben.pmusik;

import java.util.Comparator;

public class VergleicheMusikStueckTitel implements Comparator<MusikStueck> {
    @Override
    public int compare(MusikStueck m1, MusikStueck m2) {
        return m1.getTitel().compareTo(m2.getTitel());
    }
}
