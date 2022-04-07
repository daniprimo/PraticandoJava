package StreamAPI.Reduce;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Daniel",8.3);
        Aluno aluno2 = new Aluno("Luana",8.3);
        Aluno aluno3 = new Aluno("Gabi",9.3);
        Aluno aluno4 = new Aluno("Lia",10.0);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2,aluno3,aluno4);

        //predicate verdadeiro ou falso
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Function<Aluno, Double> apenasNota = a -> a.getNota();
        BiFunction<Media, Double, Media> caclcularMedia = (media, nota) -> media.adicionar(nota);
        //combinador terceiro nivel do reduce
        BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1,m2);

        Media media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(),caclcularMedia,combinarMedia);

        System.out.println("Media dos Aprovados é " + media.getValor());
    }
}
