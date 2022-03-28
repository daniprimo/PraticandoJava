package Lambdas.InterfaceFuncionalBinary;

import java.util.function.BinaryOperator;

public class MainBinary {
    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x,y) -> x*y;
        System.out.println(calc.apply(2.0, 8.0));

        double resultado = calc.apply(4.0, 10.0);
        System.out.println(resultado);

        calc = (x,y) -> x / y;
        System.out.println(calc.apply(2.0, 8.0));

    }

}
