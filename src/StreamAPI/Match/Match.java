package StreamAPI.Match;

import StreamAPI.Reduce.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Daniel",8.3);
        Aluno aluno2 = new Aluno("Luana",3.3);
        Aluno aluno3 = new Aluno("Gabi",9.3);
        Aluno aluno4 = new Aluno("Lia",10.0);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2,aluno3,aluno4);

        //predicate verdadeiro ou falso
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();


        System.out.println(alunos.stream().allMatch(aprovado));//se tdoso foram aprovados
        System.out.println(alunos.stream().anyMatch(aprovado));//se algum foi aprovado
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
