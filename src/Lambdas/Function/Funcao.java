package Lambdas.Function;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par":"Impar";
        System.out.println(parOuImpar.apply(32));//Apply para inserir o valor principal e o segundo e o retorno

        Function<String, String> oResultadoE = valor -> "O Resultado é: " + valor;

        Function<String, String> empolgado = valor -> valor + "!!!";

        String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(33); // funções encadeadas
        System.out.println(resultadoFinal);



    }
}
