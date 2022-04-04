package StreamAPI.Reduce;


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Daniel",8.3);
        Aluno aluno2 = new Aluno("Luana",3.3);
        Aluno aluno3 = new Aluno("Gabi",9.3);
        Aluno aluno4 = new Aluno("Lia",10.0);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2,aluno3,aluno4);

        //predicate verdadeiro ou falso
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Function<Aluno, Double> apenasNota = a -> a.getNota();
        BinaryOperator<Double> somatorio = (a, b) -> a+b;

        alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);

    }
}
