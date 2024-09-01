package models;

import java.util.ArrayList;

public class Evento {
    private String nome;
    private boolean[] ocorrencias;
    private ArrayList<Avaliacao> avaliacoes;

    public Evento (String nome, boolean[] ocorrencias) {
        this.nome = nome;
        this.ocorrencias = ocorrencias;
        avaliacoes = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public boolean[] getOcorrencias() {
        return ocorrencias;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public void exibirAvaliacoes() {
        for (Avaliacao avaliacaoIterada: this.getAvaliacoes()){
            System.out.println(avaliacaoIterada);
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}
