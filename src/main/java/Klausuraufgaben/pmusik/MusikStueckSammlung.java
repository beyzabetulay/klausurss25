package Klausuraufgaben.pmusik;

import java.util.*;

public class MusikStueckSammlung {
    private Map<String, MusikStueck> sammlung = new HashMap<>();

    public void musikStueckEinfuegen(MusikStueck neu) {
        if (sammlung.containsKey(neu.getTitel())) {
            throw new IllegalArgumentException("Titel bereits vorhanden: " + neu.getTitel());
        }
        sammlung.put(neu.getTitel(), neu);
    }

    public List<MusikStueck> getAlleMusikStueckeNachTitel() {
        List<MusikStueck> liste = new ArrayList<>(sammlung.values());
        liste.sort(new VergleicheMusikStueckTitel());
        return liste;
    }

    public List<MusikStueck> getAlleMusikStueckeNachLaenge() {
        List<MusikStueck> liste = new ArrayList<>(sammlung.values());
        liste.sort(new VergleicheMusikStueckLaenge());
        return liste;
    }
}
