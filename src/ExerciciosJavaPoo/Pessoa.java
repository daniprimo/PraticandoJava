package ExerciciosJavaPoo;
/*
Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
        nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
        método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
        da pessoa.
*/

import java.util.Objects;

public class Pessoa {

    Agenda agenda;

    final private int anoAtual = 2022;
    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private double altura;

    Pessoa () { }
    Pessoa (String nome) { this.nome = nome; }

    Pessoa (String nome,Double altura,int dia, int mes, int ano) {
        this.nome = nome;
        this.altura = altura;
        setDataNascimento(dia,mes,ano);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento () {
        return dia+"/"+mes+"/"+ano;
    }

    public void setDataNascimento (int dia, int mes, int ano) {
        if (dia <= 31 && mes <= 12){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else {
            System.out.println("Data de Nascimento invalida");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIdade (){
        return anoAtual - ano;
    }


    public  void mostrarDados () {

        System.out.println("Nome: "+ getNome());
        System.out.println("Data de nascimento: "+ getDataNascimento());
        System.out.println("Altura: "+ getAltura());
        System.out.println("Idade: "+ calcularIdade()+" anos");
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return anoAtual == pessoa.anoAtual && dia == pessoa.dia && mes == pessoa.mes && ano == pessoa.ano && Double.compare(pessoa.altura, altura) == 0 && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anoAtual, nome, dia, mes, ano, altura);
    }
}
