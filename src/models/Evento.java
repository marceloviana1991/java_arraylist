package models;

import java.util.ArrayList;

/*
Todo objeto da classe Evento, logo após instanciado, é adicionado
 a um ArrayList da classe Cronograma
 */
public class Evento implements Comparable<Evento> {
    private int id;
    private String atividade;

    /*
    Array boolean de tamanho 7 que tem a função de determinar os espaços que serão ocupados
    pelo objeto Evento na tabela de exibição da classe Cronograma, representadando uma semana
    de eventos
     */
    //private boolean[] ocorrencias;
    private DiaDaSemana diaDaSemana;
    private ArrayList<Avaliacao> avaliacoes;

    public Evento (String atividade, DiaDaSemana diaDaSemana) {
        this.atividade = atividade;
        this.diaDaSemana = diaDaSemana;
        avaliacoes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", atividade='" + atividade + '\'' +
                ", diaDaSemana=" + diaDaSemana +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

//    public boolean[] getOcorrencias() {
//        return ocorrencias;
//    }

    public void setAvaliacoes(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public void exibirAvaliacoes() {
        avaliacoes.forEach(System.out::println);
    }

    public DiaDaSemana getDiaDaSemana() {
        return diaDaSemana;
    }

    @Override
    public int compareTo(Evento evento) {
        return this.getDiaDaSemana().compareTo(evento.getDiaDaSemana());
    }
}
