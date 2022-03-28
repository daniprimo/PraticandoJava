package Lambdas.DesafioDeBinary;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Geladeira", 4800.80, 0.20);
        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);//calcular preco do produto com o desconto
        UnaryOperator<Double> impostoMunicipal= valor -> valor >= 2500 ? valor * 1.085 : valor;//calcular imposto do produto de 8,2% apartir de valor 2500
        UnaryOperator<Double> frete= valor -> valor >= 3000 ? valor + 100: valor + 50;//calcular frete de produtos com o valor final apartir de 3000
        UnaryOperator<Double> arredondar = valor -> Math.round(valor*100.0)/100.0; //deixar duas casas decimais
        Function<Double, String> formatar= valor -> ("R$" + valor).replace(".",",");//formatar valor R$

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar).andThen(formatar).apply(produto1);
        System.out.println("O Pŕeço final é: "+ preco);







    }
}
