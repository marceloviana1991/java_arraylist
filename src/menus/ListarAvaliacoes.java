package menus;

import models.Cronograma;
import models.Evento;

import java.util.ArrayList;
import java.util.Scanner;

public class ListarAvaliacoes {
    public static void listarAvaliacoes(ArrayList<Cronograma> cronogramas, Scanner leitura) {
        System.out.println("Informe o título do cronograma: ");
        String tituloCronograma = leitura.next();
        System.out.println("Informe o nome do evento: ");
        String nomeEvento = leitura.next();
        Evento eventoEncontrado = FindEvento.findEvento(nomeEvento, tituloCronograma, cronogramas);
        eventoEncontrado.exibirAvaliacoes();
    }
}
