package ExercicioTelevisão;
//
//Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e
//        trocar os canais da televisão. O controle de volume permite:
//         aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
//         aumentar e diminuir o número do canal em uma unidade
//         trocar para um canal indicado;
//         consultar o valor do volume de som e o canal selecionado.

import java.util.*;

public class Televisao {

    final List<Canal> listaDeCanais = new ArrayList<>();

    private int volume;
    private int auxCanal;
    private int atual;

    public List<Canal> getListaDeCanais() {
        return listaDeCanais;
    }

    public void setListaDeCanais(double canal, String nomeDoCanal) {
        this.listaDeCanais.add(new Canal(canal,nomeDoCanal));
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume += volume;
    }

    void diminuirVolume () {
        this.volume -= 1;
    }


   void canalAtual (int canal) {
        atual = canal;
        System.out.println(listaDeCanais.get(canal).getNomeDoCanal());
    }


    public int getAuxCanal() {
        return auxCanal;
    }

    public void aumentarAuxCanal(int auxCanal) {
        this.auxCanal += auxCanal;
    }

    public void abaixarAuxCanal(int auxCanal) {
        this.auxCanal -= auxCanal;
    }

    void mostraTodosCanais (){
        for (Canal aux:listaDeCanais) {
            System.out.println("Nome do canal: "+ aux.getNomeDoCanal());
            System.out.println("Numero do canal: "+ aux.getCanal());
        }
    }


    void mostraInfo (){
            System.out.println("Nome do canal: "+ listaDeCanais.get(atual).getNomeDoCanal());
            System.out.println("Numero do canal: "+listaDeCanais.get(atual).getCanal());
    }

        void canalDesejado (double canal){
            System.out.println(listaDeCanais.get(listaDeCanais.indexOf(canal)));
    }
}
