package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class formasDeAcessoasLIst {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Bia", "Carlos","San","Ellen");

        System.out.println("Primeiro jeito com o for comum....");
        for (int i =0;i < aprovados.size();i++){
            System.out.println(aprovados.get(i));
        }

        System.out.println("Segundo jeito com o foreach....");
        for (String nome:aprovados) {
            System.out.println(nome);
        }

        System.out.println("Terceiro jeito com o Iterator....");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Quarto jeito com o StreamAPI....");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);



    }
}
