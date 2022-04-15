package TratamentoDeErros.ExcecaoPersonalizadaB;

public class Aluno {
   public String nome;
    public double nota;
    public double bomComportamento;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getBomComportamento() {
        return bomComportamento;
    }

    public void setBomComportamento(double bomComportamento) {
        this.bomComportamento = bomComportamento;
    }
}
