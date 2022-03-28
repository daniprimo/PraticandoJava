package Herança;

public class Civic extends Carro {

    Civic (){
        super(200);
    }

    @Override
    void acelerar (){
        super.acelerar();
    }

    @Override
    void frear (){
        super.frear();
    }
}
