package Escola;

public class Main {
    public static void main(String[] args) {
        Aluno daniel = new Aluno("Daniel Lopes","52.801.256-3","11 98585-0569");
        Aluno Antony = new Aluno("Daniel Lopes","52.801.256-3","11 98585-0569");
        Aluno Paulo = new Aluno("Daniel Lopes","52.801.256-3","11 98585-0569");
        Aluno RIcardo = new Aluno("Daniel Lopes","52.801.256-3","11 98585-0569");
        Professor rose = new Professor("Rose Meire", "55.201.548-8", "11 97878-7878");
        Professor Maria = new Professor("Rose Meire", "55.201.548-8", "11 97878-7878");

        rose.passarNota(daniel);
        System.out.println();
        Maria.passarNota(RIcardo);



    }
}
