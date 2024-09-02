package menus;

import models.Cronograma;

import java.util.ArrayList;

public class ListarCronogramas {
    public static void listarCronogramas(ArrayList<Cronograma> cronogramas) {
        // Lista
        cronogramas.forEach(System.out::println);
    }
}
