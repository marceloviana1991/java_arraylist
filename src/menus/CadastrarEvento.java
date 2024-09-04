package menus;

import models.Cronograma;
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
            boolean[] ocorrencias = new boolean[7];
            System.out.println("Cadastro de ocorrências:");
            System.out.println("Corresponde a validação de ocorrência de evento em período de 7 dias");
            for (int i = 0; i < 7; i++) {
                int n = i + 1;
                int aux = 2;
                while (aux != 0 && aux != 1){
                    System.out.println(n + " - Digite 1(V) para verdadeiro e 0(F) para falso:");
                    aux = leitura.nextInt();
                    if (aux != 0 && aux != 1){
                        System.out.println("...");
                        System.out.println("Número inválido!");
                    }
                }
                if (aux == 1){
                    ocorrencias[i] = true;
                } else{
                    ocorrencias[i] = false;
                }
            }
            Evento evento = new Evento(atividade, ocorrencias);
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
