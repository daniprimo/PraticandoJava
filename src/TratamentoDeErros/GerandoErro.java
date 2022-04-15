package TratamentoDeErros;

public class GerandoErro {
    public static void main(String[] args) {
        try {
            gerandoErro1();
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            gerandoErro2();
        }catch (RuntimeException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }

    static void gerandoErro1 (){//não checada
        throw new RuntimeException("Gerando Erro #01");
    }

    static void gerandoErro2 () throws Exception {
         new Exception("Gerando Erro #02");
    }
}
