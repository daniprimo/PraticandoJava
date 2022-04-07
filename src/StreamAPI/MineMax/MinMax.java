package StreamAPI.MineMax;

import StreamAPI.Reduce.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Daniel",8.3);
        Aluno aluno2 = new Aluno("Luana",3.3);
        Aluno aluno3 = new Aluno("Gabi",9.3);
        Aluno aluno4 = new Aluno("Lia",10.0);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2,aluno3,aluno4);
        Comparator<Aluno> melhorNota = (a1, a2) -> {
            if(a1.getNota() > a2.getNota()) return 1;
            if(a1.getNota() < a2.getNota()) return -1;
            return 0;
        };

        Comparator<Aluno> piorNota = (a1, a2) -> {
            if(a1.getNota() > a2.getNota()) return -1;
            if(a1.getNota() < a2.getNota()) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());

        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());
    }
}
