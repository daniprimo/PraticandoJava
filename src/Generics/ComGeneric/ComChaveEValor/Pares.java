package Generics.ComGeneric.ComChaveEValor;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Pares<X extends Number, Y> {

    private final Set<Par<X,Y>> itens = new HashSet<>();

    public void adicionar (X chave, Y valor){
        if (chave == null) return ;
        Par<X, Y> novoPar = new Par<X, Y>(chave,valor);
        if (itens.contains(novoPar)){
            itens.remove(novoPar);
        }
        itens.add(novoPar);
    }

    public Y getValor(X chave) {
        if (chave == null) return null;
        Optional<Par<X,Y>> parOpcional = itens.stream()
                .filter(p -> chave.equals(p.getChave()))
                .findFirst();
        return parOpcional.isPresent() ? parOpcional
                .get()
                .getValor() : null;
    }
}
