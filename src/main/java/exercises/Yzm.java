package exercises;

public class Yzm {
    public static int tageImMonat(String monat) throws IllegalArgumentException {
        int tage = switch(monat) {
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember" -> 31;
            default -> throw new IllegalArgumentException("Monat könnte nicht gefunden werden ");
        };
        return tage;
    }

    public static void main(String args[]) {
    }

}
