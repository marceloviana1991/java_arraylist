package models;

import java.util.ArrayList;

/*
Todo objeto da classe Evento, logo após instanciado, é adicionado
 a um ArrayList da classe Cronograma
 */
public class Evento {
    private int id;
    private String atividade;
    /*
    Array boolean de tamanho 7 que tem a função de determinar os espaços que serão ocupados
    pelo objeto Evento na tabela de exibição da classe Cronograma, representadando uma semana
    de eventos
     */
    private boolean[] ocorrencias;
    private ArrayList<Avaliacao> avaliacoes;

    public Evento (int id,String atividade, boolean[] ocorrencias) {
        this.id = id;
        this.atividade = atividade;
        this.ocorrencias = ocorrencias;
        avaliacoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getAtividade() {
        return atividade;
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
        return atividade;
    }
}
