package ExerciciosJavaPoo;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Daniel Lopes Sousa Moreira");
        pessoa.setDataNascimento(2,8,1999);
        pessoa.setAltura(1.70);
        pessoa.mostrarDados();

        System.out.println("-------------------------------------");

        Pessoa pessoa1 = new Pessoa("Paulo", 1.75,31,10,1972);
        Pessoa pessoa2 = new Pessoa("Eronice", 1.60,16,01,1973);
        Pessoa pessoa3 = new Pessoa("Pedro", 1.62,7,6,2010);
        Pessoa pessoa4 = new Pessoa("Samanta", 1.68,7,9,1998);
        Pessoa pessoa5 = new Pessoa("Lucas", 1.72,15,3,1992);
        Pessoa pessoa6 = new Pessoa("Kamila", 1.65,4,7,1992);
        Pessoa pessoa7 = new Pessoa("Julia", 1.75,31,10,2008);
        Pessoa pessoa8 = new Pessoa("Fernanda", 1.75,14,10,1993);
        Pessoa pessoa9 = new Pessoa("Emilly", 1.75,8,07,1995);
        Pessoa pessoa10 = new Pessoa("Henrrique", 1.75,28,10,1973);



        agenda.adicionarPessoa(pessoa1);
        agenda.adicionarPessoa(pessoa2);
        agenda.adicionarPessoa(pessoa3);
        agenda.adicionarPessoa(pessoa4);
        agenda.adicionarPessoa(pessoa5);
        agenda.adicionarPessoa(pessoa6);
        agenda.adicionarPessoa(pessoa7);
        agenda.adicionarPessoa(pessoa8);
        agenda.adicionarPessoa(pessoa9);
        agenda.adicionarPessoa(pessoa10);



        agenda.removePessoa("Samanta");
        agenda.removePessoa("Kamila");
        agenda.removePessoa("Henrrique");

       agenda.mostrarAgenda();
       agenda.imprimePessoa(2);





    }
}
