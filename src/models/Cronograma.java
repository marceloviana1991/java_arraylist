package models;

import java.util.ArrayList;

/*
Todo objeto da classe Cronograma, logo após instanciado, é adicionado
 a um ArrayList da classe Main
*/
public class Cronograma {
    private int id;
    private String titulo;
    private ArrayList<Evento> eventos;

    public Cronograma() {
        eventos = new ArrayList<>();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Cronograma{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }
}
