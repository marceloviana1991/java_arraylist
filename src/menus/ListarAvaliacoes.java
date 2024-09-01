package menus;

import models.Cronograma;
import models.Evento;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListarAvaliacoes {
    static Scanner leitura = new Scanner(System.in);
    public static void listarAvaliacoes(ArrayList<Cronograma> cronogramas) {
        try {
            System.out.println("Informe o título do cronograma: ");
            String tituloCronograma = leitura.next();
            System.out.println("Informe o nome do evento: ");
            String nomeEvento = leitura.next();
            Evento eventoEncontrado = FindEvento.findEvento(nomeEvento, tituloCronograma, cronogramas);
            eventoEncontrado.exibirAvaliacoes();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível listar as avaliações!");
        }

    }
}
