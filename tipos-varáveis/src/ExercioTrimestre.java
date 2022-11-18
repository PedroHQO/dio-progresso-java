public class ExercioTrimestre {
    //è preciso definir uma classe trimestral
  public static void main(String[] args) {
      //Fazendo o balanço do trimestre com os gastos em cada mês
      int janeiro = 15000;
      int fevereiro = 23000;
      int marco = 17000;
      
      
        System.out.println("Despesa média mensal dos gastos");
        System.out.println("JANEIRO $" + janeiro);
        System.out.println("FEVEREIRO $" + fevereiro);
        System.out.println("MARÇO $" + marco);
      //Realizando a soma trimestral
      int somaTotal; 
        somaTotal = janeiro + fevereiro + marco;
            System.out.println("Despesa total no trimestre $" + somaTotal);
            
    int mediaMensal;
        mediaMensal = somaTotal / 3;
        System.out.println("A média mensal dos gastos são $" + mediaMensal);
  }


}

