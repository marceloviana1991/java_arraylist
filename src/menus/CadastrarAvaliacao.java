package menus;

import models.Avaliacao;
import models.Cronograma;
import models.Evento;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastrarAvaliacao {
    public static void cadastrasAvaliacao(ArrayList<Cronograma> cronogramas) {
        try{
            Scanner leitura = new Scanner(System.in);
            // Captura
            System.out.println("Informe o id do cronograma: ");
            int idCrongrama  = leitura.nextInt();
            Cronograma cronogramaEncontrado = cronogramas.get(idCrongrama);
            System.out.println("Informe o id do evento: ");
            int idEvento  = leitura.nextInt();
            // Cadastra
            Evento eventoEncontrado = cronogramaEncontrado.getEventos().get(idEvento);
            System.out.println("Informe a nota de avaliação: ");
            double nota = leitura.nextDouble();
            System.out.println("Informe uma tag de avaliação: ");
            String tagDeAvaliacao = leitura.next();
            System.out.println("Informe um texto de avaliação: ");
            var recebeQuebraLinha = leitura.nextLine();
            String textoDeAvaliacao = leitura.nextLine();
            Avaliacao avaliacao = new Avaliacao(nota, tagDeAvaliacao, textoDeAvaliacao);
            // Adiciona
            eventoEncontrado.setAvaliacoes(avaliacao);
            System.out.println("...");
            System.out.println("Avaliacao cadastrada com sucesso!");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível adicionar a avaliação!");
        }
    }
}
