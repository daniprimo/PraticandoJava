package TratamentoDeErros.ExcecaoPersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException {
    private String nomeDoAtributo;
    public StringVaziaException(String nomeDoAtributo){
      this.nomeDoAtributo = nomeDoAtributo;
  }

  public String getMenssage(){
        return String.format("O atributo %s está vazio",
                nomeDoAtributo);
  }

}
