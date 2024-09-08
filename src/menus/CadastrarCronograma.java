package menus;

import models.Cronograma;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastrarCronograma {
    public static void cadastrarCronograma(ArrayList<Cronograma> cronogramas) {
        try {
            Scanner leitura = new Scanner(System.in);
            Cronograma cronograma = new Cronograma();
            cronogramas.add(cronograma);
            cronograma.setId(cronogramas.indexOf(cronograma));
            System.out.println("Informe o titulo do Cronograma:");
            String tituloCronograma = leitura.nextLine();
            cronograma.setTitulo(tituloCronograma);
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
