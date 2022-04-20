package Generics.ComGeneric;

public class CaixaTeste {
    public static void main(String[] args) {
//        Caixa caixaA = new Caixa();
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guarda("Segredi");
        System.out.println(caixaA.abrir());

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guarda(32.58);
        System.out.println(caixaB.abrir());

    }
}
