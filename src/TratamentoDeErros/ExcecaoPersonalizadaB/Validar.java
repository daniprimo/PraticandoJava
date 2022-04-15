package TratamentoDeErros.ExcecaoPersonalizadaB;

public class Validar {

    private Validar ( ) {}

    public static  void aluno (Aluno aluno) throws StringVaziaException, NumeroForaDoIntervalo {
        if (aluno == null){
            throw new IllegalArgumentException("O Aluno está nuleo");
        }
        if (aluno.nome == null || aluno.nome.trim().isEmpty()){
             throw new StringVaziaException("nome");
        }
        if(aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaDoIntervalo("nota");
        }
    }
}
