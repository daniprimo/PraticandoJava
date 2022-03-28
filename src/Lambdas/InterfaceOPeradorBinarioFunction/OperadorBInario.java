package Lambdas.InterfaceOPeradorBinarioFunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBInario {
    public static void main(String[] args) {
        //Porem eu não consigo da um retorno a mais poruque ele somente retornara a media
        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(9.3, 8.8));


        BiFunction<Double,Double,String> resultado = (n1, n2) -> {
            double resultadoFinal = (n1 + n2)/2;
            return resultadoFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        System.out.println(resultado.apply(4.3,5.4));

        Function<Double, String> conceito = m -> m >= 7 ? "Aprovado":"Reprovado";
        System.out.println(media.andThen(conceito).apply(9.3,4.2));

    }
}
