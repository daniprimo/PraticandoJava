package Exercicios.Pratica03;

public class ContaCorrente extends  Conta implements Rendimentos, Imposto{

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double rendimento(double saldo) {
        return saldo + saldo * 0.03;
    }

    @Override
    public void mostraExtrato() {
        System.out.println();
        System.out.println("Extrato Conta Corrente");
        super.mostraExtrato();
        System.out.println("Saldo com Rendimento: R$"+ rendimento(getSaldo()));
        System.out.println("Imposto Conta Corrente: R$"+ calcularImposto());
    }

    @Override
    public double calcularImposto() {
        return rendimento(getSaldo()) * 25/100;
    }
}
