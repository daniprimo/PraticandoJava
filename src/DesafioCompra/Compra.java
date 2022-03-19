package DesafioCompra;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Itens> intens = new ArrayList<>();

    //adcionando o produto de itens dentro da compra
    void adicionarIntens (Produto produto, int quantidade) {
        this.intens.add(new Itens(produto,quantidade));
    }

    //adicionando e criando novo produto na lista itens dentro da compra
    void adicionarIntens (String nome, double preco, int quantidade) {
        this.intens.add(new Itens( new Produto(nome, preco),quantidade));
    }

    double obterValorTotal () {
        double total = 0;
        for (Itens item : intens){
            total += item.quantidade * item.produto.preco;        }
        return total;
    }

}
