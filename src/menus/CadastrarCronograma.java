package menus;

import models.Cronograma;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastrarCronograma {
    public static void cadastrarCronograma(ArrayList<Cronograma> cronogramas) {
        try {
            Scanner leitura = new Scanner(System.in);
            // Cadastra
            System.out.println("Informe o id para cadastrar o cronograma");
            int id = leitura.nextInt();
            Cronograma cronograma = new Cronograma(id);
            // Adiciona
            cronogramas.add(id, cronograma);
            System.out.println("...");
            System.out.println("Cronograma adicionado com sucesso!");
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("...");
            System.out.println("ERRO DE DIGITAÇÃO");
            System.out.println("Não foi possível adicionar o cronograma!");
        }
    }
}
