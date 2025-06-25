package Klausuraufgaben.pbaum;

public class Baum<E extends Comparable<E>> {

    public static class Knoten<E> {
        Knoten<E> left;
        Knoten<E> right;
        E content;

        public Knoten(E content) {
            this.content = content;
        }
    }

    Knoten<E> root;

    public void einfuegen(E content) {
        root = einfuegen(root, content);
    }

    private Knoten<E> einfuegen(Knoten<E> current, E content) {
        if (current == null) return new Knoten<>(content);

        if (content.compareTo(current.content) < 0) {
            current.left = einfuegen(current.left, content);
        } else {
            current.right = einfuegen(current.right, content);
        }
        return current;
    }

    public void traversiere(Visitor<E> visitor) {
        if (root == null) return;
        traversiere(root, visitor);
    }

    protected void traversiere(Knoten<E> current, Visitor<E> visitor) {
        if (current.left != null) traversiere(current.left, visitor);
        visitor.visit(current);
        if (current.right != null) traversiere(current.right, visitor);
    }

    public int size() {
        Tour<E> visitor = new Tour<>();
        traversiere(visitor);
        return visitor.getCount();
    }
}
