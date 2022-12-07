import java.util.Locale;
import java.util.Scanner;

public class AbaoutMe {

    public static void main(String[] args) { 
        //criando o objeto scanner  
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();



        //Imprimindo os dados obtidos pelo o usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " Anos");
        System.out.println("Minha altura é " + altura + "cm");
        System.out.println("Meu peso é " + peso + "Kg");
    }     
}