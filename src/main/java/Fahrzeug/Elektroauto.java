package Fahrzeug;

public class Elektroauto extends Fahrzeug implements Ladefaehig {
    @Override
    void fahre() {
        System.out.println("fahrt mit " + geschwindigkeit +"km/h");
    }

    @Override
    public void lade() {
        System.out.println("ElektroAuto wird geladen.");
    }
}
