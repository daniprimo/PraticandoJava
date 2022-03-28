package ExercicioTelevisão;

public class ControleRemoto {

    void aumentarVolume (Televisao televisao){
        if (televisao.getVolume() >= 0 && televisao.getVolume() < 10){
            televisao.setVolume(1);
            System.out.println("Aumentando Volume....");
        }else if (televisao.getVolume() >= 10){
            System.out.println("Impossivel Aumentar volume ja está no MAXIMO");
        }
        System.out.println();
    }

    void abaixarVolume (Televisao televisao){
        if (televisao.getVolume() > 0){
            televisao.diminuirVolume();
        }else{
            System.out.println("Volume ja esta no minimo");
        }
    }

    void aumentaCanal (Televisao televisao){
        int auxAumenta = televisao.getAuxCanal() + 1;
        if (televisao.getAuxCanal() < televisao.listaDeCanais.size()){ televisao.canalAtual(auxAumenta); }
    }

    void abaixarCanal (Televisao televisao){
        int abaixarCanal = televisao.getAuxCanal() - 1;
        if (abaixarCanal > 0) {televisao.canalAtual(abaixarCanal);}

    }

    void encontraCanal (Televisao televisao,int canal){
        televisao.canalAtual(canal);
    }


}
