package models;

public class Avaliacao {
    private final double nota;
    private final String tag;

    public Avaliacao (double nota, String tag) {
        this.nota = nota;
        this.tag = tag;
    }

    @Override
    public String toString() {
        return nota + " - " + tag;
    }
}
