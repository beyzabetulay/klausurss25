package exercises;

public class l144 {
    private final int a;
    private final int b;

    public l144(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Punkte müssen positiv sein.");
        }
        this.a = a;
        this.b = b;
    }

    public boolean ueberschneidetSich(l144 andere) {
        int maxStart = Math.max(this.a, andere.a);
        int minEnde = Math.min(this.b, andere.b);

        return maxStart < minEnde;
    }

    @Override
    public String toString() {
        if (a == b) {
            return String.valueOf(a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        for (int i = 0; i < b - a - 1; i++) {
            sb.append("-");
        }
        sb.append(b);
        return sb.toString();
    }


}
