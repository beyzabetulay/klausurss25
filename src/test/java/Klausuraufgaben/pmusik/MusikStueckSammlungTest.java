package Klausuraufgaben.pmusik;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MusikStueckSammlungTest {

    @Test
    void testSortierung() {
        MusikStueckSammlung sammlung = new MusikStueckSammlung();
        sammlung.musikStueckEinfuegen(new MusikStueck("B", "X", 300));
        sammlung.musikStueckEinfuegen(new MusikStueck("A", "Y", 100));

        List<MusikStueck> nachTitel = sammlung.getAlleMusikStueckeNachTitel();
        assertEquals("A", nachTitel.get(0).getTitel());

        List<MusikStueck> nachLaenge = sammlung.getAlleMusikStueckeNachLaenge();
        assertEquals(100, nachLaenge.get(0).getLaenge());
    }
}
