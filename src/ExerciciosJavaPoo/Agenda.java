package ExerciciosJavaPoo;
/*Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
seguintes operações:
void armazenaPessoa(String nome, int idade, float altura);
void removePessoa(String nome);
int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
agenda.*/

import com.sun.source.doctree.SeeTree;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Agenda {

    final List<Pessoa> agenda = new ArrayList<>();



    public int  buscarPessoa (String nome){
        int aux = 0;
        for (Pessoa pessoa: agenda) {
            if (pessoa.getNome() == nome){ aux = agenda.indexOf(pessoa); }
        }
        return aux;
    };

    void imprimePessoa (int index){
        for (Pessoa pessoa:agenda){
            if (index == agenda.indexOf(pessoa))
                pessoa.mostrarDados();
        }
    };

    void removePessoa(String nome){
        for (int i=0;i <= agenda.size();i++){
            if (i == buscarPessoa(nome))
            agenda.remove(buscarPessoa(nome));
        }
    };



    void armazenaPessoa (String nome, int dia, int mes, int ano, double altura){
        if(agenda.size() <= 9){
            this.agenda.add(new Pessoa(nome,altura,dia,mes,ano));
        }else {
            System.out.println("Agenda Cheia");
        }
    };



    void adicionarPessoa (Pessoa pessoa){
        if(agenda.size() <= 9){
            this.agenda.add(pessoa);
        }else {
            System.out.println("Agenda Cheia");
        }
    }

    void mostrarAgenda () {
        for (Pessoa pessoa: agenda) {
            pessoa.mostrarDados();
            System.out.println();
        }
    }





}
