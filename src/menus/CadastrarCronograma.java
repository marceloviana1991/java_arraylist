package menus;

import models.Cronograma;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastrarCronograma {
    static Scanner leitura = new Scanner(System.in);
    public static void cadastrarCronograma(ArrayList<Cronograma> cronogramas) {
        try {
            System.out.println("Informe o título do cronograma: ");
            String titulo = leitura.next();
            Cronograma cronograma = new Cronograma(titulo);
            cronogramas.add(cronograma);
            System.out.println("...");
            System.out.println("Cronograma adicionado com sucesso!");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível adicionar o cronograma!");
        }

    }
}
