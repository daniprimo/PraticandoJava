package ExercicioElevador;

//Crie uma classe denominada Elevador para armazenar as informações de um elevador
//        dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
//        no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
//        presentes nele. A classe deve também disponibilizar os seguintes métodos:
//        Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
//        andares no prédio (os elevadores sempre começam no térreo e vazio);
//        Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
//        espaço);
//        Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
//        dentro dele);
//        Sobe : para subir um andar (não deve subir se já estiver no último andar);
//        Desce : para descer um andar (não deve descer se já estiver no térreo);
//        Encapsular todos os atributos da classe (criar os métodos set e get).


import java.util.List;

public class Elevador {

   private int totalDeAndares;
   private int totalDaCapacidade;
   private int andarAtual;
   private int quantidadeDePessoas;

   //iniciar ja incluir com o construtor
   Elevador (int totalDeAndares, int totalDaCapacidade){
      this.totalDeAndares = totalDeAndares;
      this.totalDaCapacidade = totalDaCapacidade;
      this.andarAtual = 0;
      this.quantidadeDePessoas = 0;
   }

   public int getQuantidadeDePessoas() {
      return quantidadeDePessoas;
   }

   public void setQuantidadeDePessoas(int quantidadeDePessoas)
   {
      int aux1 = this.quantidadeDePessoas;
      int aux2 = quantidadeDePessoas;

      if ((aux1+aux2) <= totalDaCapacidade ) {
         this.quantidadeDePessoas += quantidadeDePessoas;
      }else{
         System.out.println("Elevador esta lotado aguarde o proximo....");
      }
      aux1=0;
      aux2=0;
      System.out.println();
   }


   public int getTotalDeAndares() {
      return totalDeAndares;
   }

   public void setTotalDeAndares(int totalDeAndares) {
      this.totalDeAndares = totalDeAndares;
   }

   public int getAndarAtual() {
      return andarAtual;
   }

   public void setAndarAtual(int andarAtual) {

      this.andarAtual += andarAtual;
   }

   public int gettotalDaCapacidade() {
      return totalDaCapacidade;
   }

   public void settotalDaCapacidade(int totalDaCapacidade) {
      this.totalDaCapacidade = totalDaCapacidade;
   }

   void infos (){
      System.out.println("Capacidade de pessoas: "+ gettotalDaCapacidade());
      System.out.println("Quantas pessoas no elevador: "+ getQuantidadeDePessoas());
      System.out.println("Vagas no elevador: "+ (gettotalDaCapacidade()-getQuantidadeDePessoas()));
      System.out.println("Andar atual do elevador: "+ getAndarAtual());
      System.out.println();
   }

   public void entrar (int quantasPessoas) {
     if (this.getQuantidadeDePessoas() < this.gettotalDaCapacidade()){
        this.setQuantidadeDePessoas(quantasPessoas);
        System.out.println("Entrando no elevaodor: "+ quantasPessoas);
        System.out.println();
     }else{
        System.out.println("Elevador está lotado em sua capacidade aguarde a proxima....");
        System.out.println("Vagas no elevador: "+ (gettotalDaCapacidade()-getQuantidadeDePessoas()));
        System.out.println();
     }
   }

   void sair (int quantosVaiSair){

      if (this.getQuantidadeDePessoas() > 0 && quantosVaiSair <= quantidadeDePessoas){
         System.out.println("Saindo do elevador: "+ quantosVaiSair);
         this.quantidadeDePessoas -= quantosVaiSair;
         System.out.println();
      }else if (quantosVaiSair > quantidadeDePessoas) {
         System.out.println("Ipossivel ser "+quantosVaiSair+" pessoas para sair sendo que temos "+quantidadeDePessoas+" no elevador");
      } else {
         System.out.println("Impossivel alguem sair pois Elevador esta vazio.....");
         System.out.println();
      }
   }

   void sobe (){

      if (getAndarAtual() >= 0 && getAndarAtual() <= getTotalDeAndares()){
      this.setAndarAtual(1);
         System.out.println("Elevador no "+getAndarAtual()+"º Andar....");
      }else{
         System.out.println("Impossivel subir elevador ja esta no ultimo andar");
      }

   }
   void desce (){
      if (getAndarAtual() > 0){
         this.andarAtual -= 1;
         System.out.println("Elevador no "+getAndarAtual()+"º Andar....");
      }else{
         System.out.println("Impossivel descer por que elevador está no terreo");
      }

   }


}
