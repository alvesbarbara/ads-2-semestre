
package Lista3;

import java.util.Scanner;


public class Tabuada {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
 
        System.out.println("Digite um numero inteiro");
        int numero = leitor.nextInt();
        
       for (Integer i = 0; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", numero, i, numero * i));
        }
        
    }
}
//Crie uma classe chamada "Tabuada" que:
// 1 solicite um numero para o usuário.
//2 Exiba a tabuada correspodente ao número digitado
//%s = String
//%d = Inteiro
//%f = número com ponto flutuante. Na verdade o "f" representa a vírgula.
//\t = tabulação
//\n = pular linha
