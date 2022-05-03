package PadroesDeProjeto.Observer;

import java.util.Date;

public class EventoChegadaAniversariante {
//classe que define que tipo do botão vai ser acionado para cada operação
    private final Date momento;


    public EventoChegadaAniversariante(Date momento) {
        this.momento = momento;
    }

    public Date getMomento(){
        return momento;
    }
}
