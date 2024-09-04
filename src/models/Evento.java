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

    public Evento (String atividade, boolean[] ocorrencias) {
        this.atividade = atividade;
        this.ocorrencias = ocorrencias;
        avaliacoes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return atividade;
    }

    public String getStringId() {
        return "Evento{" +
                "id=" + id +
                "}";
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean[] getOcorrencias() {
        return ocorrencias;
    }

    public void setAvaliacoes(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public void exibirAvaliacoes() {
        avaliacoes.forEach(System.out::println);
    }

}
