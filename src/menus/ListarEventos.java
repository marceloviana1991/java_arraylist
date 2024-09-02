package menus;

import models.Cronograma;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ListarEventos {
    public static void listarEventos(ArrayList<Cronograma> cronogramas) {
        try {
            Scanner leitura = new Scanner(System.in);
            // Captura
            System.out.println("Informe o id do cronograma: ");
            int idCronograma = leitura.nextInt();
            Cronograma cronogramaEncontrado = cronogramas.get(idCronograma);
            // Lista
            cronogramaEncontrado.contruirTabelaDeEventos();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível adicionar os eventos!");
        }
    }
}
