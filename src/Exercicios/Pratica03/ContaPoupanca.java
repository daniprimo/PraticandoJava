package Exercicios.Pratica03;

public class ContaPoupanca extends  Conta implements Rendimentos, Imposto{

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double rendimento(double saldo) {
        return saldo + saldo * 0.05;
    }

    @Override
    public void mostraExtrato() {
        System.out.println();
        System.out.println("Extrato Conta Poupanca");
        super.mostraExtrato();
        System.out.println("Saldo com Rendimento: R$"+ rendimento(getSaldo()));
        System.out.println("Imposto Conta Corrente: R$"+ calcularImposto());
    }

    @Override
    public double calcularImposto() {
        return rendimento(getSaldo()) * 10/100;
    }
}
