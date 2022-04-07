package Exercicios.Pratica03;

public abstract class Conta {

    private static int numero;
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero++;
    }

    public int getNumero (){
        return numero;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostraExtrato(){
        System.out.println("Numero da Conta: "+ getNumero());
        System.out.println("Titular: "+ getTitular());
        System.out.println("Saldo Inicial: R$"+ getSaldo());
    }
}
