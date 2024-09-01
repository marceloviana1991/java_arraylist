package menus;

import models.Cronograma;

import java.util.ArrayList;

public class ListarCronogramas {
    public static void listarCronogramas(ArrayList<Cronograma> cronogramas) {
        for (Cronograma cronogramaIterado: cronogramas){
            System.out.println(cronogramaIterado.getTitulo());
            System.out.println();
        }
    }
}
