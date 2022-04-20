package Generics.SemGeneric;

public class Aplicacao {
    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guarda(2.3);

      //  Integer coisa = (Integer) caixaA.abrir();// foi realizado cast porem, com o tipo errado e isso gera exceptions
        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guarda("OLa");

        String coisaB = (String) caixaA.abrir();
        System.out.println(coisaB);


    }
}
