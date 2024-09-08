package menus;

import models.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastrarAvaliacao {
    public static void cadastrasAvaliacao(ArrayList<Cronograma> cronogramas) {
        try{
            Scanner leitura = new Scanner(System.in);
            // Captura
            cronogramas.forEach(System.out::println);
            System.out.println("Informe o id do cronograma: ");
            int idCrongrama  = leitura.nextInt();
            Cronograma cronogramaEncontrado = cronogramas.get(idCrongrama);
            cronogramaEncontrado.getEventos().forEach(System.out::println);
            System.out.println("Informe o id do evento: ");
            int idEvento  = leitura.nextInt();
            // Cadastra
            Evento eventoEncontrado = cronogramaEncontrado.getEventos().get(idEvento);
            System.out.println("Informe a nota de avaliação: ");
            double nota = leitura.nextDouble();
            int menu;
            TagDeAvaliacao tagDeAvaliacao = null;
            do {
                System.out.println("""
                        Informe um número para escolher uma tag de avaliação: 
                        1 - MUITO_BOM
                        2 - BOM
                        3 - PODE_MELHORAR
                        4 - RUIM
                        5 - MUITO_RUIM
                        """);
                menu = leitura.nextInt();
                switch (menu) {
                    case 1:
                        tagDeAvaliacao = TagDeAvaliacao.MUITO_BOM;
                        break;
                    case 2:
                        tagDeAvaliacao = TagDeAvaliacao.BOM;
                        break;
                    case 3:
                        tagDeAvaliacao = TagDeAvaliacao.PODE_MELHORAR;
                        break;
                    case 4:
                        tagDeAvaliacao = TagDeAvaliacao.RUIM;
                        break;
                    case 5:
                        tagDeAvaliacao = TagDeAvaliacao.MUITO_RUIM;
                        break;
                    default:
                        System.out.println("Número inválido!");
                        menu = 0;
                }
            } while (menu == 0);
            System.out.println("Informe um texto de avaliação: ");
            var recebeQuebraLinha = leitura.nextLine();
            String textoDeAvaliacao = leitura.nextLine();
            Avaliacao avaliacao = new Avaliacao(nota, tagDeAvaliacao, textoDeAvaliacao);
            // Adiciona
            eventoEncontrado.setAvaliacoes(avaliacao);
            System.out.println("...");
            System.out.println("Avaliacao cadastrada com sucesso!");
            System.out.println(avaliacao);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível adicionar a avaliação!");
        }  catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("...");
            System.out.println("id não encontrado!");
        }
    }
}
