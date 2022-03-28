package Herança;

public class Ferrari extends Carro {

    Ferrari (){
        super(350);
    }

    @Override
    void acelerar (){
        super.acelerar();
        super.acelerar();
        super.acelerar();
        super.acelerar();
        super.acelerar();
    }

    @Override
    void frear (){
        super.frear();
        super.frear();
    }

    @Override
    public String toString() {
        return "Ferrari "+ super.toString();
    }
}
