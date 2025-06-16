package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class l144Test {
    @Test
    void testKonstruktorSortiert() {
        l144 s = new l144(8, 2);
        assertEquals("2------8", s.toString());
    }

    @Test
    void testKeineUeberschneidung() {
        l144 s1 = new l144(1, 3);
        l144 s2 = new l144(3, 5);
        assertFalse(s1.ueberschneidetSich(s2));  // Berührung an Punkt 3 → keine Überschneidung
    }

    @Test
    void testUeberschneidung() {
        l144 s1 = new l144(1, 4);
        l144 s2 = new l144(3, 6);
        assertTrue(s1.ueberschneidetSich(s2));
    }

    @Test
    void testToStringEinPunkt() {
        l144 s = new l144(4, 4);
        assertEquals("4", s.toString());
    }

    @Test
    void testToStringNormal() {
        l144 s = new l144(3, 5);
        assertEquals("3--5", s.toString());
    }

}