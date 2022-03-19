package AplicationMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informa o primeiro salario: ");
        String valor1 = scan.next().replace(",",".");

        System.out.println("Informa o primeiro salario: ");
        String valor2 = scan.next().replace(",",".");

        System.out.println("Informa o primeiro salario: ");
        String valor3 = scan.next().replace(",",".");

//        double primeiroValor = Double.parseDouble(valor1);
//        double segundoValor = Double.parseDouble(valor2);
//        double terceiroValor = Double.parseDouble(valor3);
//
//        double media = (primeiroValor+segundoValor+terceiroValor)/3;
//
//        System.out.println("A media do salario é: "+ media);

        int primeiroValor = Integer.parseInt(valor1);
        int segundoValor = Integer.parseInt(valor2);
        int terceiroValor = Integer.parseInt(valor3);

        int media = (primeiroValor+segundoValor+terceiroValor)/3;

        System.out.println();

                scan.close();
    }
}
