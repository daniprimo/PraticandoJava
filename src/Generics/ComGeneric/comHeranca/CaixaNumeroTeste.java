package Generics.ComGeneric.comHeranca;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guarda(2.3);
        System.out.println(caixaA.abrir());
    }
}
