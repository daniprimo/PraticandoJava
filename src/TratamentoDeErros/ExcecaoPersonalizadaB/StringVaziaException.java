package TratamentoDeErros.ExcecaoPersonalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
    private String nomeDoAtributo;
    public StringVaziaException(String nomeDoAtributo){
      this.nomeDoAtributo = nomeDoAtributo;
  }

  public String getMenssage(){
        return String.format("O atributo %s está vazio",
                nomeDoAtributo);
  }

}
