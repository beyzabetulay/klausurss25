package Fahrzeug;

public class Fahhrad extends Fahrzeug {

    @Override
    void fahre() {
        System.out.println("Fährt mit " + geschwindigkeit + " km/h.");
    }
}
