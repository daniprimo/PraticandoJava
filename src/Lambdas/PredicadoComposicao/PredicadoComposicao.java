package Lambdas.PredicadoComposicao;

import java.util.function.Predicate;

public class PredicadoComposicao  {
    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresdigitos = num -> num >= 100 && num <= 999;

        System.out.println(isPar.test(21));

        //composição
        System.out.println(isPar.and(isTresdigitos).negate().test(20));
        System.out.println(isPar.or(isTresdigitos).test(123));

    }
}
