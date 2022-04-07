package Exercicios.Pratica02;

public class Pessoa {
      final private String nome;
      private String endereco;
      private String telefone;

        public  Pessoa (String nome, String endereco, String telefone){
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void mostrar (){
        System.out.println("Nome: "+ getNome());
        System.out.println("Endereço: "+ getEndereco());
        System.out.println("Telenofe: "+ getTelefone());
    }
}
