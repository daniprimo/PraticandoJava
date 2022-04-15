package Exercicios.Pratica04;
/*
4. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Soma
2. IMC
3. Sair
Digite a opção desejada:
Na opção 1: receber dois números, calcular e mostrar a soma.
Na opção 2: receber peso e altura, calcular e mostrar o seguinte resultado:
a) Se menor que 18.5 mostrar o resultado e escrever “Peso abaixo do
normal”.
b) Se entre 18.5 e 25 mostrar o resultado e escrever “Peso normal”.
c) Se maior que 25 até 30 mostrar o resultado e escrever “Sobre o peso”.
d) Se maior que 30 até 35 mostrar o resultado e escrever “Grau de
obesidade I”.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem
*/

import java.util.ArrayList;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //SOMA
        // IMC = peso / altura²
        // SAIR

        double sum1 = 0;
        double sum2 = 0;

        int count = 0;
        int userChoice = 0;

        while(count < 1){

            System.out.println("Digite a opção desejada:");
            System.out.println("1. Soma");
            System.out.println("2. IMC");
            System.out.println("3. Sair");

            userChoice = sc.nextInt();

            switch(userChoice) {

                case(1): {

                    System.out.println("Digite o primeiro número: ");
                    sum1 = sc.nextDouble();


                    System.out.println("Digite o segundo número: ");
                    sum2 = sc.nextDouble();

                    double result = sum1 + sum2;
                    System.out.println("O resultado da soma é de: " + result);

                    break;
                }
                case(2): {

                    System.out.println("Por favor digite sua altura: ");
                    double altura = sc.nextDouble();

                    System.out.println("Por favor digite o seu peso: ");
                    double peso = sc.nextDouble();

                    double IMC = peso / Math.pow(altura, 2);

                    if (IMC < 18.5){
                        System.out.println("Peso abaixo do normal");
                    }
                    else if (IMC >= 18.5 || IMC <= 25 ){
                        System.out.println("Peso normal");
                    }
                    else if (IMC > 25 || IMC <= 30 ){

                        System.out.println("Sobre peso");
                    }

                    else if (IMC > 30 || IMC <= 35 ){
                        System.out.println("Grau de obesidade I");
                    }

                    break;
                }

                case(3): {

                    System.out.println("Obrigado por usar o sistema!");
                    count++;
                    break;
                }

                default: {

                    System.out.println("Ops! Opção inválida, por favor, tente novamente!");
                    break;
                }


            }

        }





    }
}
