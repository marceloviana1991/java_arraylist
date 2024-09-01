package menus;

import models.Cronograma;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastrarCronograma {
    public static void cadastrarCronograma(ArrayList<Cronograma> cronogramas, Scanner leitura) {
        System.out.println("Informe o título do cronograma: ");
        String titulo = leitura.next();
        Cronograma cronograma = new Cronograma(titulo);
        cronogramas.add(cronograma);
        System.out.println("...");
        System.out.println("Cronograma adicionado com sucesso!");
    }
}
