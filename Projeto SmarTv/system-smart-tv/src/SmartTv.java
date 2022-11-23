public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 15; 
    
    //Criando uma função/método que ligará TV
    public void ligar(){
        ligada = true;
    
    }

    //Criando uma função que desligará TV
    public void desligar(){
        ligada = false;
    
    }

    //Criando uma função/método que aumentará o volume da TV
    public void aumentarVolume(){
        //Mesma coisa de relizar a operação volume = volume + 1;
        volume++;
        
        //Mensagem que será mostrada sempre que realizar o método + o valor que assume volume
        System.out.println("Aumentando volume para: " + volume);

    }

    //Criando uma função/método que aabaixará o volume da TV
    public void abaixarVolume(){
        volume--;
        //Mensagem que será mostrada sempre que realizar o método + o valor que assume volume
        System.out.println("Diminuindo volume para: " + volume);

    }

    //Criando uma função/método que escolherá o novo canal escolhido
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    //Criando uma função/método que irá subir o canal
    public void subirCanal(){
        canal++;

        System.out.println("Subindo o canal para: " + canal);
    }

    //Criando uma função/método que irá abaixará o canal
    public void abaixarCanal(){
        canal--;

        System.out.println("Abaixando o canal para: " + canal);
    }
}