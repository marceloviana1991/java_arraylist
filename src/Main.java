import menus.*;
import models.Cronograma;

import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cronograma> cronogramas = new ArrayList<>();

        int menu;

        do {
            System.out.println("""                
              
                
                
                *****************************
                1- Para cadastrar cronogramas
                2- Para cadastrar eventos
                3- Para cadastrar avaliações
                4- Para listar cronogramas
                5- Para listar eventos
                6- Para listar avaliações
                0- Para sair
                *****************************
                """);
            try {
                Scanner leitura = new Scanner(System.in);
                menu = leitura.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("...");
                System.out.println("ERRO DE DIGITAÇÃO");
                menu = 100;
                continue;
            }
            switch (menu) {
                case 1:
                    CadastrarCronograma.cadastrarCronograma(cronogramas);
                    break;
                case 2:
                    CadastrarEvento.cadastrarEvento(cronogramas);
                    break;
                case 3:
                    CadastrarAvaliacao.cadastrasAvaliacao(cronogramas);
                    break;
                case 4:
                    ListarCronogramas.listarCronogramas(cronogramas);
                    break;
                case 5:
                    ListarEventos.listarEventos(cronogramas);
                    break;
                case 6:
                    ListarAvaliacoes.listarAvaliacoes(cronogramas);
            }
        } while (menu != 0);
    }
}



