// Tipos de OPERADORES LOGICOS
// && funciona como a porta logica AND, só é verdadeira quando todos forem verdade
// || funciona coo a porta logica OR, só é falsa quando todos forem falso
// ^  funciona como a porta logica XOR(excluiva), só é verdadeiro 
// quando as expressões forem distintas

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));
        System.out.println("b1 && b4 " + (b1 && b4));
        System.out.println("b2 && b4 " + (b2 && b4));
        System.out.println("b3 || b1 " + (b3 || b1));
        System.out.println("b2 || b4 " + (b2 || b4));
        System.out.println("b4 ^ b1 " + (b4 ^b1));

        int i1 = 8;
        int i2 = 4;
        int i3 = 22;
        float f1 = 10f;
        float f2 = 15.14f;
        double d1 = 3.14;

        System.out.println("((i1 * i2) > (i3 + f2)) && true " + (((i1 * i2) > (i3 + f2)) && true));
        System.out.println("((f1 - d1) != (f2 - i1)) || true " + (((f1 - d1) != (f2 - i1)) || true));
        System.out.println("((f1 - d1) > (f2 - i3)) && true " + (((f1 - d1) > (f2 - i3)) && true));
        System.out.println("((f1 - d1) <= (f2 - i1)) ^ true " + (((f1 - d1) <= (f2 - i1)) ^false));
        System.out.println("((i3 * d1) == (f2 - i2)) ^ false " + (((i3 * d1) == (f2 - i2)) ^ false));
    
    
    
        double salarioMensal = 1800d;
        double mediaSalario = 900d;

        int quantidadeDependentes = 5;
        int mediaDependetes = 2;

        System.out.println((salarioMensal > mediaSalario) && (quantidadeDependentes <= mediaDependetes));
        
        boolean salarioAlto = salarioMensal > (mediaSalario + 400);
        boolean muitosDependentes = quantidadeDependentes >= mediaDependetes;
        
        System.out.println((salarioAlto) || muitosDependentes);

        boolean receberAuxilio = (salarioAlto) ^ (muitosDependentes);
        
        System.out.println("Você pode recer auxilio? " + receberAuxilio);


    }
    

    

    
}
