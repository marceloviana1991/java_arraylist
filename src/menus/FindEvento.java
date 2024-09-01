package menus;

import models.Cronograma;
import models.Evento;

import java.util.ArrayList;

public class FindEvento {
    public static Evento findEvento(String nomeEvento, String tituloCronograma, ArrayList<Cronograma> cronogramas) {
        Cronograma cronograma = FindCronograma.findCronograma(tituloCronograma, cronogramas);
        for (Evento evento : cronograma.getEventos()){
            if (evento.getNome().equals(nomeEvento)) {
                return evento;
            }
        }
        return null;
    }
}
