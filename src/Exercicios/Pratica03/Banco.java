package Exercicios.Pratica03;
/*
3. Considerando os conceitos de Orientação a Objetos,
crie uma classe abstrata Pai de nome Conta com os seguintes atributos
(número, titular e saldo) e mais duas classes
Filhas (ContaCorrente e ContaPoupanca). Na classe Conta deve existir um método
de nome rendimento que retorna o rendimento mensal da conta, nas classes filhas
deve existir o mesmo método rendimento, porém com as seguintes regras:
⦁ Para ContaCorrente, o método rendimento deve retornar o saldo * 0.03;
⦁ Para ContaPoupanca, o método rendimento deve retornar o saldo * 0.05;
Por fim, criar uma classe principal que instancie objetos de ContaCorrente e
ContaPoupanca, adicione no mínimo um valor para cada atributo e imprima cada
conta (ContaCorrente e ContaPoupanca) com seus devidos rendimentos.
Obs: Encapsular atributos das classes.

4. Aproveitando o seu código já escrito na questão 3, crie uma interface chamada
Imposto que contenha o método calcularImposto() e implemente ela em
ContaCorrente e ContaPoupanca com a seguinte regra:
⦁ Para ContaCorrente, o método calcularImposto() deve retornar o rendimento * 25%;
⦁ Para ContaPoupanca, o método calcularImposto() deve retornar o rendimento *
10%;
*/
public class Banco {
    public static void main(String[] args) {
            Conta danielCC = new ContaCorrente("Daniel Lopes", 5000.00d);
            Conta danielCP = new ContaPoupanca("Daniel Lopes", 3000.00d);

            danielCC.mostraExtrato();
            danielCP.mostraExtrato();

    }
}
