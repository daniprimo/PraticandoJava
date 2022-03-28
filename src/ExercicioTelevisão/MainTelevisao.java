package ExercicioTelevisão;

public class MainTelevisao {

    public static void main(String[] args) {
        Televisao samsung = new Televisao();
        samsung.setListaDeCanais(5.1,"Rede Gobo");
        samsung.setListaDeCanais(7,"Rede Record");
        samsung.setListaDeCanais(103,"Sportv");
        ControleRemoto controle = new ControleRemoto();
        controle.aumentarVolume(samsung);
        controle.aumentarVolume(samsung);
        controle.aumentarVolume(samsung);
        controle.aumentarVolume(samsung);
        System.out.println(samsung.getVolume());
        controle.abaixarVolume(samsung);
        System.out.println(samsung.getVolume());

        samsung.mostraInfo();
        controle.aumentaCanal(samsung);
        samsung.mostraInfo();
        controle.aumentaCanal(samsung);
        controle.aumentaCanal(samsung);
        controle.aumentaCanal(samsung);



    }

}
