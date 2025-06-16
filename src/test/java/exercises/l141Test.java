package exercises;

import static exercises.l141.berechneKugelvolumen;
import static org.junit.jupiter.api.Assertions.*;
import java.util.InputMismatchException;
import javax.annotation.processing.SupportedAnnotationTypes;

import org.junit.jupiter.api.Test;

class l141Test {
    @Test
    public  void l141Test()
    { double d = berechneKugelvolumen(1.1);
        assertEquals(4.181459821928016,d,0.0001);}
    @Test
    public void r0(){
        double d = berechneKugelvolumen(0.0);
        assertEquals(0,d,0.0001);

    }

    @Test
    public void r1(){
        double d = berechneKugelvolumen(1.0);
        assertEquals(3.141592653589793,d,0.0001);

    }

    @Test
    public void rminus() {

        assertThrows(InputMismatchException.class,()->berechneKugelvolumen(-1.0));


    }

}