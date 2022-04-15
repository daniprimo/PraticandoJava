package TratamentoDeErros.ExcecaoPersonalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException {
    private String nomeDoAtributo;
    public  NumeroNegativoException(String nomeDoAtributo){
      this.nomeDoAtributo = nomeDoAtributo;
  }

  public String getMenssage(){
        return String.format("O atributo %s está negativo",
                nomeDoAtributo);
  }


}
