package Klausuraufgaben.pbaum;

public interface Visitor<T> {
    void visit(Baum.Knoten<T> current);
}
