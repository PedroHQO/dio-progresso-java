public class User {
    public static void main(String[] args) throws Exception {
        //criando uma classe
        SmartTv smartTv = new SmartTv();

        
        //Usando a classe usuário de controle remoto, para retornar o estado da tv.
        //Repare que dentro do printlin alem de ter o retorno, também concatenamos 
        //com uma frase
        System.out.println("Tv Ligada ?  " + smartTv.ligada);

        //Ela retorna o teste se está ligando ou não, ela puxa a resposta da outra clase SmartTv
        smartTv.ligar ();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

        //verifica qual canal a Tv se encontra inicialmente
        System.out.println("Canal Atual ?" + smartTv.canal);
        //System.out.println("Volume Atual ? " + smartTv.volume);

        //Qual canal a Tv assumi após chamar o método novo canal
        smartTv.mudarCanal(25);

        System.out.println("Novo Status -> Escolhendo canal de preferência! ");

        //Mostra qual é o novo canal
        System.out.println("Canal Atual ?" + smartTv.canal);

        //Realiza a operação subindo e abaixando o canal enquanto mostra o canal no momento
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.abaixarCanal();
        
        //Mostra o canal atual
        System.out.println("Canal Atual ?" + smartTv.canal);
        

        //Testa o volume atual e mostra na tela de acordo com os métodos chamdos
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual ? " + smartTv.volume);

        //Mostrando na tela o novo estado da TV
        smartTv.desligar ();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);


    }
}
