package TratamentoDeErros.ExcecaoPersonalizadaA;

public class Main {
    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Dan", 15);
            Validar.aluno(aluno);
        }catch (StringVaziaException e){
            System.out.println(e.getMenssage());
        }catch (NumeroForaDoIntervalo e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");

    }
}
