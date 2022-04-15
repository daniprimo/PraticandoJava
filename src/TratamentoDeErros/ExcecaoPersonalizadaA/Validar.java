package TratamentoDeErros.ExcecaoPersonalizadaA;

public class Validar {

    private Validar ( ) {}

    public static  void aluno (Aluno aluno){
        if (aluno == null){
            throw new IllegalArgumentException("O Aluno está nuleo");
        }
        if (aluno.nome == null || aluno.nome.trim().isEmpty()){
             new StringVaziaException("nome");
        }
    }
}
