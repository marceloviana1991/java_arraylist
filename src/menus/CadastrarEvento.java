package menus;

import models.Cronograma;
import models.DiaDaSemana;
import models.Evento;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastrarEvento {
    public static void cadastrarEvento(ArrayList<Cronograma> cronogramas) {
        try{
            Scanner leitura = new Scanner(System.in);
            // Captura
            System.out.println("Informe o id do cronograma que vai receber esse evento: ");
            int idCrongrama  = leitura.nextInt();
            Cronograma cronogramaEncontrado = cronogramas.get(idCrongrama);
            // Cadastra
            System.out.println("Informe a atividade realizada no evento: ");
            var recebeQuebraLinha = leitura.nextLine();
            String atividade = leitura.nextLine();
            int menu = 0;
            DiaDaSemana diaDaSemana = null;
            while (menu == 0) {
                System.out.println("""
                        Digite um número para escolher o dia será realizado esse evento:
                        1 - SEGUNDA
                        2 - TERÇA
                        3 - QUARTA
                        4 - QUINTA
                        5 - SEXTA
                        6 - SÁBADO
                        7 - DOMINGO
                        """);
                menu = leitura.nextInt();
                switch (menu) {
                    case 1:
                        diaDaSemana = DiaDaSemana.SEGUNDA;
                        break;
                    case 2:
                        diaDaSemana = DiaDaSemana.TERCA;
                        break;
                    case 3:
                        diaDaSemana = DiaDaSemana.QUARTA;
                        break;
                    case 4:
                        diaDaSemana = DiaDaSemana.QUINTA;
                        break;
                    case 5:
                        diaDaSemana = DiaDaSemana.SEXTA;
                        break;
                    case 6:
                        diaDaSemana = DiaDaSemana.SABADO;
                        break;
                    case 7:
                        diaDaSemana = DiaDaSemana.DOMINGO;
                        break;
                    default:
                        System.out.println("Número inválido!");
                        menu = 0;
                }
            }
            Evento evento = new Evento(atividade, diaDaSemana);
            // Adiciona
            cronogramaEncontrado.getEventos().add(evento);
            evento.setId(cronogramaEncontrado.getEventos().indexOf(evento));
            System.out.println("...");
            System.out.println("Evento cadastrado com sucesso!");
            System.out.println(evento.getStringId());
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível adicionar o evento!");
        }

    }
}
