package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class l143Test {
    l143 p;
    @Test
    void vornamefalsch(){
        RuntimeException e = assertThrows(
                RuntimeException.class,()-> p =new l143("beyz","ay",new Adresse("Hubland","E16","Würzburg",97074)));
        assertEquals(e.getMessage(),"vorname muss mit einem großbuchstaben anfangen");
    }
    @Test
    void ortfalsch(){
        RuntimeException e = assertThrows(
                RuntimeException.class,()-> p =new l143("Beyz","ay",new Adresse("Hubland","E16","würzburg",97074)));
        assertEquals(e.getMessage()," strasse und ort müssen mit einem großen buchstaben anfangen");
    }
@Test
    void strfalsch(){
        RuntimeException e = assertThrows(
                RuntimeException.class,()-> p =new l143("Beyz","ay",new Adresse("hubland","E16","Würzburg",97074)));
        assertEquals(e.getMessage()," strasse und ort müssen mit einem großen buchstaben anfangen");
    }
@Test
    void hausnummerfalsch(){
        RuntimeException e = assertThrows(
                RuntimeException.class,()-> p =new l143("Beyz","ay",new Adresse("Hubland","16E","Würzburg",97074)));
        assertEquals(e.getMessage(),"hausnummer soll mit einem gorßbuchstaben anfangen");
    }


}