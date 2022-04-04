package StreamAPI.Filter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        DesafioCliente a1 = new DesafioCliente("Daniel Lopes","CEO",32.000);
        DesafioCliente a2 = new DesafioCliente("Pedro Lopes","Diretor de Infraestrutura",25.000);
        DesafioCliente a3 = new DesafioCliente("Ramon Santos","DEV Estagiario",1.600);
        DesafioCliente a4 = new DesafioCliente("Sara Santos", "DEV Senior",5.300);
        DesafioCliente a5 = new DesafioCliente("Henrrique", "DEV Junior",3.00);

        List<DesafioCliente> funcioanrios = Arrays.asList(a1,a2,a3,a4,a5);


        funcioanrios.stream()
                .filter(a -> a.getSalario() >= 4.000)
                .map(a -> a.getNome() + " Faz parte do alto escalão")
                .forEach(System.out::println);


        Predicate<DesafioCliente> operacao = a -> a.getSalario() <= 4.000;
        Function<DesafioCliente, String> parabenizando = a -> a.getNome() + " Faz parte do quadro da operação";
        System.out.println();
        funcioanrios.stream()
                .filter(operacao)
                .map(parabenizando)
                .forEach(System.out::println);


            Produto produto1 = new Produto("Camisa Nike", 200.00, 15.00);
            Produto produto2 = new Produto("Tennis Nike", 600.00, 20.00);
            Produto produto3 = new Produto("Adidas Sultan", 350.00, 0.00);
            Produto produto4 = new Produto("Nike Shoqs", 800.00, 25.00);

            List<Produto> produtos = Arrays.asList(produto1,produto2,produto3,produto4);

        System.out.println("Produto na promoção");
            produtos.stream()
                    .filter(a -> a.frete <= 0.00)
                    .map(a -> a.nome + " Promoção com frete gratis")
                    .forEach(System.out::println);

            Predicate<Produto> maisCaros = a -> a.preco >= 500;
            Function<Produto, String> apresentando = a -> a.nome+" Grupo de produtos Premium";

        System.out.println();
            produtos.stream()
                    .filter(maisCaros)
                    .map(apresentando)
                    .forEach(System.out::println);
    }

}
