package ExercicioElevador;

public class Main {
    public static void main(String[] args) {
        Elevador santos = new Elevador(5,6);

        santos.sobe();
        santos.entrar(5);
        santos.sobe();
        santos.entrar(1);
        santos.sair(3);
        santos.sobe();
        santos.sair(1);
        santos.sobe();
        santos.sobe();
        santos.sobe();

        santos.desce();
        santos.desce();
        santos.sair(2);
        santos.desce();
        santos.desce();
        santos.entrar(1);
        santos.desce();
        santos.desce();
        santos.desce();


        santos.infos();

    }
}
