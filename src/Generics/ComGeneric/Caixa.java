package Generics.ComGeneric;

public class Caixa<TIPO> {

    private TIPO coisa;

    public void guarda (TIPO coisa) {
        this.coisa = coisa;
    }

    public TIPO abrir () {
        return coisa;
    }
}
