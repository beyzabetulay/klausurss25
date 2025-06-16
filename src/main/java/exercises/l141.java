package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class l141 {
    public static double berechneKugelvolumen(double radius) {
        double res = 1;
        if (radius >= 0) {
            res = 4 / 3 * Math.PI * radius * radius * radius;
        } else {
            throw new InputMismatchException("kücük olmaz salak");

        }
        return res;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bitte geben sie ein double ");
        double d = scanner.nextDouble();
        System.out.println(berechneKugelvolumen(d));
    }
}
