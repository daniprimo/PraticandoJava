package Herança;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;

    Carro (int velocidadeMaxima){
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar (){
        if (velocidadeAtual + 5 >  VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += 5;
        }
    }

    void frear (){
        if (velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }else {
            velocidadeAtual = 0;
        }
    }

    public String toString (){
        return "Velocidade: "+ velocidadeAtual+"Km/h.";
    }
}
