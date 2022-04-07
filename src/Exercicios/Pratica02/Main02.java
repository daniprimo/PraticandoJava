package Exercicios.Pratica02;
/*
2. Crie uma Classe Pessoa, contendo os atributos (nome, endereço e telefone)
encapsulados, com seus respectivos seletores (getters) e modificadores (setters), e
ainda o construtor padrão. Por fim, criar uma classe principal que instancie o objeto
Pessoa, adicione no mínimo um valor para cada atributo e imprima na tela.
*/
public class Main02 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Daniel", "Rua Ipixuna, 141", "11 98585-0569");

        pessoa.mostrar();
    }
}
