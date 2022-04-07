package Exercicios.Pratica01;
/*
Elabore um algoritmo para mostrar os números ímpares existentes em um intervalo.
O usuário deverá fornecer os valores inicial (inicial > 0) e final (inicial < final) e os
números ímpares existentes no intervalo ([inicial, final]) devem ser separados por um
espaço em branco.
Exemplo:
Entrada: 2 13
Saída: 3 5 7 9 11 13
*/

import javax.swing.*;

public class NumerosImpares {
    public static void main(String[] args) {
        VerificarNumero verificar = new VerificarNumero();
        int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        verificar.verificando(primeiroNumero,segundoNumero);



    }
}
