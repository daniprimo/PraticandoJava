package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;// substituindo o sout pelo encapsulando o print
        Consumer<Object> printo = System.out::println;// substituindo o sout pelo encapsulando o print

        Stream<String> langs = Stream.of("Java", "Lua","Kotlin","JS\n");
        langs.forEach(print);

        String[] maisLangs = {"Phyton", "Lisp", "Perl","Go\n"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 2).forEach(print);//funcionalidade Stream para dar o start dentro do Arrays e onde sair

        System.out.println("Criar Stream apartir das collections");
        List<String> outrasLangs = Arrays.asList("C","PHP", "Kotlin\n");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);


        System.out.println("Criar com metodo generate gerando stream infinita sem ordenação");

//        Stream.generate(() -> "a").forEach(print);
        System.out.println("Criar com metodo Iterate que gera com ordenação infinita");
//        Stream.iterate(0, n-> n+1).forEach(printo);
    }
}
