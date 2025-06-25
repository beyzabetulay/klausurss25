package Klausuraufgaben.pfahrt;


public class EBike extends Fahrrad implements Elektrofahrzeug {
    @Override
    public void kehreZurückZurLadestation() {
        System.out.println("EBike kehrt zur Ladestation zurück.");
    }
}
