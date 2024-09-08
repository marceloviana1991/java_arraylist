package models;

/*
Todo objeto da classe Avaliacao, logo após instanciado, é adicionado
 a um ArrayList da classe Evento
 */
public class Avaliacao {
    private double nota;
    private TagDeAvaliacao tag;
    private String texto;

    public Avaliacao (double nota, TagDeAvaliacao tag, String texto) {
        this.nota = nota;
        this.tag = tag;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "nota=" + nota +
                ", tag=" + tag +
                ", texto='" + texto + '\'' +
                '}';
    }
}
