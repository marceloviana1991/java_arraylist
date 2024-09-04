package menus;

import models.Cronograma;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class CadastrarCronograma {
    public static void cadastrarCronograma(ArrayList<Cronograma> cronogramas) {
        try {
            Cronograma cronograma = new Cronograma();
            cronogramas.add(cronograma);
            cronograma.setId(cronogramas.indexOf(cronograma));
            System.out.println("...");
            System.out.println("Cronograma adicionado com sucesso!");
            System.out.println(cronograma);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível adicionar o cronograma!");
        }
    }
}
