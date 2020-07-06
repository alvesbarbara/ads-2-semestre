
package Lista1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro");
        Integer num1 = leitor.nextInt();
        
        System.out.println("Digite outro número inteiro");
                Integer num2 = leitor.nextInt();
                
                
          
        
        System.out.println("O resultado da soma dos números digitados é  " + (num1 + num2) +"\n"); 
        System.out.println("O resultado da subtração dos números digitados é " + (num1 - num2) +"\n");
        System.out.println("O resultado da multiplicação dos números digitados é  " + (num1 * num2) +"\n"); 
        System.out.println("O resultado da divisão dos números digitados é  " + (num1 / num2) +"\n"); 
    }
    
}


