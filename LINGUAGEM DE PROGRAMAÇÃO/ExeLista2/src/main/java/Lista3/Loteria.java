
package Lista3;

import java.util.Random;
import java.util.Scanner;

 public class Loteria {
     public static void main (String[] args) {
        Random gerar = new Random(); // está gerando numeros aleatórios
        Scanner leitor = new Scanner(System.in); //etá fazendo leitura do que o usuaario digita

        System.out.println("Digite um número (0 a 10):");
        Integer numero = leitor.nextInt();
        Integer aleatorio;
        Integer contador = 0;

        do {
            aleatorio = gerar.nextInt(11);
            System.out.println(String.format("Número sorteado: %d", aleatorio));
            contador++;
        } while (!numero.equals(aleatorio));

        System.out.println(String.format("A máquina acertou o número %d, foram %d tentativas.\n", numero, contador));
        
        if (contador <= 3) {
            System.out.println("Você é muito sortudo");
        } else if (contador > 3 && contador < 11) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor ser trabalhador!");
        }
    }

    
       
}

//Exercício 02 - Acerte o número
//Crie uma classe chamada “Loteria” que:
//Solicite um número entre 0 e 10 para o usuário. 
//Tente advinhar o número digitado através de números randômicos(Random).
//A cada iteração exiba o número sorteado. 
//Quando acontecer o “acerto” se a quantidade de vezes necessárias for:
//1. Até 3: exiba "Você é MUITO sortudo" 
//2. Entre 4 e 10: exiba "Você é sortudo" 
//3. Mais de 10: exiba "É melhor você ser trabalhador"