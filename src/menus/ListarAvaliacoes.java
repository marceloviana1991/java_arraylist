package menus;

import models.Cronograma;
import models.Evento;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListarAvaliacoes {
    public static void listarAvaliacoes(ArrayList<Cronograma> cronogramas) {
        try {
            Scanner leitura = new Scanner(System.in);
            // Captura
            System.out.println("Informe o id do cronograma:");
            int idCronograma = leitura.nextInt();
            Cronograma cronogramaEncontrado = cronogramas.get(idCronograma);
            System.out.println("Informe o id do evento: ");
            int idEvento = leitura.nextInt();
            Evento eventoEncontrado = cronogramaEncontrado.getEventos().get(idEvento);
            // Lista
            eventoEncontrado.exibirAvaliacoes();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível listar as avaliações!");
        }  catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("...");
            System.out.println("id não encontrado!");
        }
    }
}
