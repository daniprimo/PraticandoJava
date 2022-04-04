package StreamAPI.Reduce.Reduce4;

public class MediaTeste {
    public static void main(String[] args) {

        Media m1 = new Media().adicionar(5.8).adicionar(8.7);
        Media m2 = new Media().adicionar(8.8).adicionar(9.0);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());
    }
}
