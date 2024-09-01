package menus;

import models.Cronograma;

import java.util.ArrayList;
import java.util.Scanner;

public class ListarEventos {
    public static void listarEventos(ArrayList<Cronograma> cronogramas, Scanner leitura) {
        System.out.println("Informe o título do cronograma: ");
        String tituloCronograma = leitura.next();
        Cronograma cronogramaEncontrado = FindCronograma.findCronograma(tituloCronograma, cronogramas);
        cronogramaEncontrado.contruirTabelaDeEventos();
    }
}
