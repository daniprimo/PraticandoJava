package PadroesDeProjeto.Observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    //REpresanta o Subjs ele que notifica observadores

    private List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();


    public void registraObservadores(ChegadaAniversarianteObservador o){
        observadores.add(o);
    }

    public void monitorar(){
        Scanner entrada = new Scanner(System.in);

        String valor  = "";

        while (!"Sair".equalsIgnoreCase(valor)){

            System.out.println("Aniversariante chegou?");
            valor = entrada.nextLine();

            if("sim".equalsIgnoreCase(valor)){
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

                observadores.stream()
                        .forEach(o -> o.chegou(evento));
                    valor="sair";
                    break;
            }else {
                System.out.println("Alarme Falso!!");
            }

        }
    }


}
