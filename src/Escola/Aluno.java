package Escola;

public class Aluno extends Pessoa {

    private static int registroAluno;
    protected double notaPortugues;
    protected double notaMatematica;
    protected double notaGeografia;
    protected double notaFisica;

    public Aluno(String nome, String rg, String telefone) {
        super(nome, rg, telefone);
        registroAluno++;
    }

    public static int getRegistroAluno() {
        return registroAluno;
    }

    public static void setRegistroAluno(int registroAluno) {
        Aluno.registroAluno = registroAluno;
    }

    public double getNotaPortugues() {
        return notaPortugues;
    }

    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaGeografia() {
        return notaGeografia;
    }

    public void setNotaGeografia(double notaGeografia) {
        this.notaGeografia = notaGeografia;
    }

    public double getNotaFisica() {
        return notaFisica;
    }

    public void setNotaFisica(double notaFisica) {
        this.notaFisica = notaFisica;
    }

    public void mostraInfoAluno () {
        System.out.println("RA"+ registroAluno);
        System.out.println("Nome do aluno: "+ getNome());
        System.out.println("Nota Portugues: "+ getNotaPortugues());
        System.out.println("Nota Matematica: "+ getNotaMatematica());
        System.out.println("Nota Geografia: "+ getNotaGeografia());
        System.out.println("Nota Fisica: "+ getNotaFisica());

        double media = (getNotaFisica()+getNotaGeografia()+getNotaMatematica()+getNotaPortugues())/4;
        System.out.println("Media: "+ media);
        if (media < 6){
            System.out.println(getNome() +" Reprovado");
        }else if (media >= 6 && media < 9){
            System.out.println(getNome()+" Aprovado");
        }else if (media >= 9){
            System.out.println(getNome()+" Aprovado Bonus");
        }

    }
}
