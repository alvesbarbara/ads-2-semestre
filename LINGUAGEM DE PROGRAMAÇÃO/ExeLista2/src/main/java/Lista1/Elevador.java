package Lista1;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println(" Digite o limite de peso de um elevador"); 
        Integer pesoElevador = leitor.nextInt();
        
        System.out.println(" Digite o limite de pessoas de um elevador"); 
        Integer qtdPessoas = leitor.nextInt();
        
        System.out.println("digite o peso da 1ª pessoa que entrou no elevador");
        Integer pesoP1 = leitor.nextInt();
        
        System.out.println("digite o peso da 2ª pessoa que entrou no elevador");
        Integer pesoP2 = leitor.nextInt();
        
        System.out.println("digite o peso da 3ª pessoa que entrou no elevador");
        Integer pesoP3 = leitor.nextInt();
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + qtdPessoas
                + " pessoas o peso total no elevador é de " + (pesoP1 + pesoP2 + pesoP3) +
        ", sendo que ele suporta " + pesoElevador);
                
    }
}


 
//Ao final, exiba uma frase assim: "Entraram 3 pessoas no elevador, no qual cabem X "
//+"pessoas. O peso total no elevador é de Y, sendo que ele suporta Z".
//(onde X é o 2º valor lido no programa, Z o 1º e Y é a soma dos pesos das 3 pessoas)