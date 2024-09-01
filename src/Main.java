import menus.*;
import models.Avaliacao;
import models.Cronograma;
import models.Evento;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cronograma> cronogramas = new ArrayList<>();
    static Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {

        int menu = 1;

        while (menu != 0) {
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
            menu = leitura.nextInt();
            switch (menu) {
                case 1:
                    CadastrarCronograma.cadastrarCronograma(cronogramas, leitura);
                    break;
                case 2:
                    CadastrarEvento.cadastrarEvento(cronogramas, leitura);
                    break;
                case 3:
                    CadastrarAvaliacao.cadastrasAvaliacao(cronogramas, leitura);
                    break;
                case 4:
                    ListarCronogramas.listarCronogramas(cronogramas);
                    break;
                case 5:
                    ListarEventos.listarEventos(cronogramas, leitura);
                    break;
                case 6:
                    ListarAvaliacoes.listarAvaliacoes(cronogramas, leitura);
            }
        }
    }
}



