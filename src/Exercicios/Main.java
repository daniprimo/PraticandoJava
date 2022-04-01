package Exercicios;

public class Main {
    public static void main(String[] args) {
        Exercicio01ArredondaNumero numero = new Exercicio01ArredondaNumero(0.5);

        numero.arredondaCentenas(4.6);
        numero.arredondaDezenas(1.5);
        numero.arredondaInteiro(3.7);
        numero.arredondaMilhares(4.5);

        MDC mdc = new MDC();


        System.out.println(mdc.gerarMDC(5.0,7.0));
        System.out.println(mdc.gerarMdcRecursive(10.0,7.0));
    }
}
