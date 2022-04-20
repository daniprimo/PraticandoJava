package Generics.ComGeneric.comHeranca;

public class CaixaIntTeste {
    public static void main(String[] args) {
//        CaixaInt<String> caixaA = new CaixaInt<>();
//        caixaA.guarda("Teste");
//        String coisaA = caixaA.abrir();
//        System.out.println(coisaA);

        CaixaInt caixaA = new CaixaInt();
        caixaA.guarda(123);
        int coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }

}
