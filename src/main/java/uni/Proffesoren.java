package uni;

public class Proffesoren extends Person {
    String fach;
    public Proffesoren(String fach) {
        this.fach = fach;
    }
    @Override
    public void gibTaetigkeitAus() {
        System.out.println("Die Proffesoren unterrichtet "+ fach);

    }
}
