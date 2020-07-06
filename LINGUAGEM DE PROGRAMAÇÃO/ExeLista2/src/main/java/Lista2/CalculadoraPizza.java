    
package Lista2;

import java.util.Scanner;

public class CalculadoraPizza {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       Scanner leitorS = new Scanner(System.in);
       
         System.out.println("Qual o valor da pizza?");
         Double valor = leitor.nextDouble();
         
         System.out.println("Qual o sabor da pizza?");
         String sabor = leitorS.nextLine();
         
         System.out.println("Quantas pessoas irá rachar a conta?");
         Double pessoas = leitor.nextDouble();
         
         System.out.println("Qual o valor maximo que cada uma aceita rachar?");
         Double rachar = leitor.nextDouble();
        
         
        if(valor >= rachar){
            System.out.println("A pizza de " + sabor +" será dividida entre " + pessoas + 
         "  pessoas. E o racha é de "+ (valor/pessoas) + " pra cada");
        }else{
            System.out.println("Deu ruim no racha. A pizza deveria custar no máximo " + (rachar * pessoas));
        }
    }
}
    