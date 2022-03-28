package Lambdas.DesafioDeBinary;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString(){
        double precoFinal = preco * 1;
        return "Nome: "+nome+" tem preço de R$"+ precoFinal;
    }


}
