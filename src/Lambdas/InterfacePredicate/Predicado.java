package Lambdas.InterfacePredicate;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto produto = new Produto("Notebooke", 3893.89, 0.15);
        System.out.println(isCaro.test(produto));

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);


    }
}
