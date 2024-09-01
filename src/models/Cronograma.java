package models;

import java.util.ArrayList;

public class Cronograma {
    private String titulo;
    private ArrayList<Evento> eventos;

    public Cronograma(String titulo) {
        this.titulo = titulo;
        eventos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(Evento evento) {
        eventos.add(evento);
    }

    public void contruirTabelaDeEventos() {
        ArrayList<ArrayList<Evento>> tabelaDeEventos = new ArrayList<>();
        for (Evento evento: this.getEventos()){
            ArrayList<Evento> tabelaInterna = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                if(evento.getOcorrencias()[i] == true){
                    tabelaInterna.add(evento);
                } else {
                    tabelaInterna.add(null);
                }
            }
            tabelaDeEventos.add(tabelaInterna);
        }
        System.out.println("Tabela de eventos:");
        for (ArrayList<Evento> tb: tabelaDeEventos){
            System.out.println(tb);
        }
        System.out.println();
    }
}
