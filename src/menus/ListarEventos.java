package menus;

import models.Cronograma;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListarEventos {
    static Scanner leitura = new Scanner(System.in);
    public static void listarEventos(ArrayList<Cronograma> cronogramas) {
        try {
            System.out.println("Informe o título do cronograma: ");
            String tituloCronograma = leitura.next();
            Cronograma cronogramaEncontrado = FindCronograma.findCronograma(tituloCronograma, cronogramas);
            cronogramaEncontrado.contruirTabelaDeEventos();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível adicionar os eventos!");
        }
    }
}
