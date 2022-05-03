package PadroesDeProjeto.Observer;

public class AniversarioSurpresa {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        var porteira = new Porteiro();

        porteira.registraObservadores(e -> System.out.println("Surpresa vai lambda"+ e.getMomento()));
        porteira.registraObservadores(namorada);
        porteira.monitorar();

    }
}
