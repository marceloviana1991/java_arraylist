package models;

import java.util.ArrayList;

/*
Todo objeto da classe Cronograma, logo após instanciado, é adicionado
 a um ArrayList da classe Main
*/
public class Cronograma {
    private int id;
    private ArrayList<Evento> eventos;

    public Cronograma(int id) {
        this.id = id;
        eventos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cronograma{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
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
        tabelaDeEventos.forEach(System.out::println);
    }
}
