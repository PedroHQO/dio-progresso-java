//Switch é para valores exatos já o if é valores booleanos
/**
 * ControleFluxo
 */
public class ControleFluxo {
    
    public static void main(String[] args) {
        //Criando métodos
        ifMeses();
        ifFerias();

        switchSemana();
    }
    //Executando método switchSemana, onde de acordo com a String definida dára o número
    // do dia ou dirá que é inválido    
    private static void switchSemana() {
        String dia = "khhgd";
        switch (dia) {
            case "Domingo":
                System.out.println(1);
                
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabádo":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
    //Executando o método ifFerias, onde de acordo com os meses escolhidos
    //Dirá se é férias ou não, mas não é muito indicado realizar essa condição
    //Com IF, melhor fazer isso com SWITCH
    private static void ifFerias() {
        String ferias = "Agosto";
        if (ferias == "Dezembro" || ferias == "Julho" || ferias == "Janeiro") {
            System.out.println("Partiu férias");
        }
        else{
            System.out.println("Não é férias ainda");
        }
    }

    //Executando o método ifMeses, onde de acordo com número escolhido dirá
    //Qual é o mês escolhido, ou se é um mês inválido.
    private static void ifMeses() {
        int mes = 16;
        if (mes == 1) {
            System.out.println("JANEIRO");
        }
        else if(mes == 2){
            System.out.println("Fevereiro");
        }
        else if(mes == 3){
            System.out.println("MARÇO");
        }
        else if(mes == 4){
            System.out.println("ABRIL");
        }
        else if(mes == 5){
            System.out.println("MAIO");
        }
        else if(mes == 6){
            System.out.println("JUNHO");
        }
        else if(mes == 7){
            System.out.println("JULHO");
        }
        else if(mes == 8){
            System.out.println("AGOSTO");
        }
        else if(mes == 9){
            System.out.println("SETEMBRO");
        }
        else if(mes == 10){
            System.out.println("OUTUBRO");
        }
        else if(mes == 11){
            System.out.println("NOVEMBRO");
        }
        else if(mes == 12){
            System.out.println("DEZEMBRO");
        }
        else {
            System.out.println("Este mês não existe!");
        }

        
     }
        
    
    
    
    
    
    
    

    
}