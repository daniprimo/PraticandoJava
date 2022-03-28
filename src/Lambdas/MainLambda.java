package Lambdas;

public class MainLambda {

    public static void main(String[] args) {

        funcional calc = (x, y) -> { return x+y; };
        System.out.println(calc.executar(3, 8));

        calc = (x, y) ->  x * y; ;
        System.out.println(calc.executar(3, 8));

    }



}
