package Lambdas.Consumer;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);// somente o nome sera impressi
        Produto p1 = new Produto("Notebook", 200.97,0.25);
        Produto p2 = new Produto("Caderno", 19.90,0.03);
        Produto p3 = new Produto("Borracha", 7.80,0.18);
        Produto p4 = new Produto("Caneta", 12.34,0.19);
        imprimir.accept(p1); //aqui
        imprimir.accept(p4); //aqui

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);
        produtos.forEach(imprimir);//receber o consumer
        produtos.forEach(p -> System.out.println(p.preco));//utiliza a primeira para percorrer em cima dos
        produtos.forEach(System.out::println);



    }

    static void imprimir (String nome){
        System.out.println(nome+"!!");
    };
}
