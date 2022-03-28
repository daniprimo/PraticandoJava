package ExerciciosJavaPoo.Repeticao;

import javax.swing.*;
import java.util.Random;

public class MainForArrays {
    public static void main(String[] args) {

        Random random = new Random();
        String[][] numerosAleatorios = new String[4][4]; // sempre atribuir new int

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i][0] = JOptionPane.showInputDialog("Digite o nome");
            double soma = 0;
            for (int a = 1; a < numerosAleatorios.length; a++) {
                numerosAleatorios[i][a] = JOptionPane.showInputDialog("Digite a " + a + "° nota.");
                soma += Double.parseDouble(numerosAleatorios[i][a]);
            }
            double media = soma / 3;
            System.out.println(numerosAleatorios[i][0] + " sua media foi "+ media);
        }

        for (String[] linha : numerosAleatorios){
            for (String coluna: linha){
                System.out.print(coluna + " ");
            }
            System.out.println();
        }


    }
}
