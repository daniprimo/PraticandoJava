package ExerciciosJavaPoo.Repeticao;

import javax.swing.*;

public class MainExercicios {
    public static void main(String[] args) {

        for (int i = 0;i < 20;i++){
            System.out.println("Eu gosto de estudar algoritmo!");
        }
        System.out.println("******************************");
        boolean validacao = true;
        int contador = 0;
        while (validacao){

            System.out.println(contador+"° Eu gosto de estudar algoritmo!");
            contador++;
            int opcao;
            System.out.println("[1] - Digite um para seguir escrevendo.");
            System.out.println("[2] - Digite um para encerrar.");
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada [1]-seguir e [2]-sair"));

            switch (opcao){
                case 1: validacao = true; break;
                case 2: validacao = false;  break;


            }
        }

        contador=0;
        do{
            System.out.println((contador+1)+"° Eu gosto de estudar algoritmo!");
            contador++;


        }while (contador < 20);

    }
}
