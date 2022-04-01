package Exercicios;

public class MDC {

    private double numero;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public MDC() {
    }

    Double gerarMdcRecursive (double primeiro, double segundo){
        if (segundo == 0){
            return primeiro;
        }
        return gerarMdcRecursive(primeiro,primeiro%segundo);
    }

    Double gerarMDC (double primeiro, double segundo){
        while (segundo != 0){
            double r = primeiro % segundo;
            primeiro = segundo;
            segundo = r;
        }
        return primeiro;
    }


}
