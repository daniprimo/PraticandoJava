package Escola;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class Professor extends Pessoa {

    public static int registroProfessor;


    public Professor(String nome, String rg, String telefone) {
        super(nome, rg, telefone);
        registroProfessor++;
    }

    public static int getRegistroProfessor() {
        return registroProfessor;
    }

    public static void setRegistroProfessor(int registroProfessor) {
        Professor.registroProfessor = registroProfessor;
    }


    public void passarNota ( Aluno aluno){
        System.out.println("RP"+ registroProfessor);
        System.out.println("Nome do Professor: "+ getNome());
        aluno.setNotaPortugues(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de portugues: ")));
        aluno.setNotaMatematica(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de Matematica: ")));
        aluno.setNotaFisica(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de Fisica: ")));
        aluno.setNotaGeografia(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de Geografia: ")));
        System.out.println("Fechamento do aluno");
        aluno.mostraInfoAluno();
    }
}
