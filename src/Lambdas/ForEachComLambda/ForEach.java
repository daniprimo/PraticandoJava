package Lambdas.ForEachComLambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Paulo", "Lia");

        System.out.println("Forma Tradicional");
        for (String nome:aprovados){
            System.out.println(nome);
        }

        System.out.println("Lambda #01...");

        aprovados.forEach((nome) -> {
            System.out.println(nome + "!!");
        });

 System.out.println("Lambda #02....");

        aprovados.forEach(nome ->
            System.out.println(nome + "!!") // se tiver apenas uma setença não preciso colocar o par de chaves
        );

        System.out.println();
        System.out.println("Utilizando o methodo reference");

        aprovados.forEach(System.out::println); //para cada uma dos aprovados mostrar


        System.out.println("Lambda com o metodo static para padronização de mostra nome #01...");

        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("Lambda com o metodo static para padronização de mostra nome #02+....");

        aprovados.forEach(ForEach::meuImprimir);



    }

    static void meuImprimir (String nome){
        System.out.println("Oi Meu nome é: "+ nome);
    };


}
