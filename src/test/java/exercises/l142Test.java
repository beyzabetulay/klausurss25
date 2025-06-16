package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class l142Test {
    l142 p;
    @BeforeEach
    void setUp() {
        p = new l142();
    }
    @Test
    void versuchx() {

        assertThrows(RuntimeException.class, ()->p.verschiebePunkt(1998, 1000));
    }
    @Test
    void versuchy() {

        assertThrows(RuntimeException.class, ()->p.verschiebePunkt(1000,1200));

    }
    @Test
    void versuchxmin() {

        assertThrows(RuntimeException.class, ()->p.verschiebePunkt(-1, 1000));
    }
    @Test
    void versuchymin() {

        assertThrows(RuntimeException.class, ()->p.verschiebePunkt(1000,-1));

    }
}