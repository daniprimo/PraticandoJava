package Exercicios;

public class Exercicio01ArredondaNumero {

    private double numero;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public Exercicio01ArredondaNumero(double numero) {
        this.numero = numero;
    }

    void arredondaInteiro (double numero){
        double aux = Math.floor(numero);
        this.setNumero(aux);
        System.out.println(getNumero());
    }

    void arredondaDezenas (double numero){
        double aux = Math.floor(numero)/10;
        this.setNumero(aux);
        System.out.println(getNumero());
    }

    void arredondaCentenas (double numero){
            double aux = Math.floor(numero)/100;
            this.setNumero(aux);
            System.out.println(getNumero());
        }

    void arredondaMilhares (double numero){
                double aux = Math.floor(numero)/1000;
                this.setNumero(aux);
                System.out.println(getNumero());
            }


}
