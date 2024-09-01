package menus;

import models.Avaliacao;
import models.Cronograma;
import models.Evento;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarAvaliacao {
    public static void cadastrasAvaliacao(ArrayList<Cronograma> cronogramas, Scanner leitura) {
        System.out.println("Informe a nota de avaliação: ");
        double nota = leitura.nextDouble();
        System.out.println("Informe uma tag de avaliação: ");
        String tagDeAvaliacao = leitura.next();
        Avaliacao avaliacao = new Avaliacao(nota, tagDeAvaliacao);
        System.out.println("Informe o nome do evento que vai receber a avaliação: ");
        String nomeEvento = leitura.next();
        System.out.println("Informe o título do cronograma esse evento está localizado: ");
        String tituloCronograma = leitura.next();
        Evento eventoEncontrado = FindEvento.findEvento(nomeEvento, tituloCronograma, cronogramas);
        if (eventoEncontrado != null) {
            eventoEncontrado.setAvaliacoes(avaliacao);
            System.out.println("...");
            System.out.println("Avaliação adicionada com sucesso!");
        } else {
            System.out.println("O evento ou o cronograma não foram encrontrados!");
        }
    }
}
