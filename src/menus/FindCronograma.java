package menus;

import models.Cronograma;

import java.util.ArrayList;

public class FindCronograma {
    public static Cronograma findCronograma(String tituloCronograma, ArrayList<Cronograma> cronogramas) {
        for (Cronograma cronograma : cronogramas) {
            if (cronograma.getTitulo().equals(tituloCronograma)) {
                return cronograma;
            }
        }
        return null;
    }
}
