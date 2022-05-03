package PadroesDeProjeto.Observer;

public class Namorada implements ChegadaAniversarianteObservador{
//Classe onde apartir do evento, é acionado os passos apartir dos eventos ocorridos


    public void chegou(EventoChegadaAniversariante evento) {
        System.out.println("Avisar os convidados...");
        System.out.println("Apagar as luzes....");
        System.out.println("Esperar um pouco......");
        System.out.println("Surpresa!!!!!");
    }
}
