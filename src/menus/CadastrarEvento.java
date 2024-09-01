package menus;

import models.Cronograma;
import models.Evento;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarEvento {
    public static void cadastrarEvento(ArrayList<Cronograma> cronogramas, Scanner leitura) {
        System.out.println("Informe o nome do evento: ");
        String nome = leitura.next();
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
        System.out.println("Informe o título do cronograma que vai receber esse evento: ");
        String tituloCronograma = leitura.next();
        Cronograma cronogramaEncontrado = FindCronograma.findCronograma(tituloCronograma, cronogramas);
        Evento evento = new Evento(nome, ocorrencias);
        if (cronogramaEncontrado != null) {
            cronogramaEncontrado.setEventos(evento);
            System.out.println("...");
            System.out.println("Evento adicionado com sucesso!");
        } else {
            System.out.println("O cronograma não foi encrontrado!");
        }
    }
}
