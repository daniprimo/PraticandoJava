package Lambdas.InterfaceOperadorUnario;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = n -> n+2;
        UnaryOperator<Integer> vezesDois = n -> n*2;
        UnaryOperator<Integer> aoQuadrado = n -> n*n;

        //andThen -> execute depois essa
        int resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resultado);

        //Compose e faca o primeiro esse depois esse inicia do primeiro
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);
    }
}
