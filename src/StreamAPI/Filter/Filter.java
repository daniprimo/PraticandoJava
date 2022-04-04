package StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        ALuno a1 = new ALuno("Ana", 7.8);
        ALuno a2 = new ALuno("Bia", 5.8);
        ALuno a3 = new ALuno("Daniel", 9.8);
        ALuno a4 = new ALuno("Gui", 6.8);
        ALuno a5 = new ALuno("Rebeca", 7.1);
        ALuno a6 = new ALuno("Pedro", 9.8);

        List<ALuno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
        Predicate<ALuno> alunoAprovado = a -> a.note >= 7;
        Function<ALuno, String> saudacaoAprovado = a -> "Parabêns " + a.nome + "! Você foi aprovado!";

        alunos.stream()
                .filter(alunoAprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}
