package Lista2;

import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite a primeira nota");
          Double n1 = leitor.nextDouble();
          
        System.out.println("Digite a segunda nota");
          Double n2 = leitor.nextDouble();
          
        System.out.println("Digite a segunda nota");
          Double n3 = leitor.nextDouble();  
    
        Double media = (n1 + n2 + n3) / 3;
        
        if(media >= 7){
            System.out.println("Sua média é: " + media + " você passou direto!");
        } else if(media < 7 && media >= 5){
            System.out.println("Sua média é: " + media + " você têm direito de fazer uma prova de recuperação");
        } else if(media <5 && media >=0){
            System.out.println("Sua média é: " + media + " você reprovou direto!");
        }      
    }  
}

//A. Solicite a primeira nota. 
//B. Solicite a segunda nota. 
//C. Solicite a terceira nota. 
//D. Realize a média das notas informadas.
//E. Exiba uma mensagem informando a situação do aluno baseado nos dados
//abaixo:
//a. Média 7 ou mais: exiba “passou direto”. b. Média entre 5 e 7: exiba
//“têm direito de fazer uma prova de
//recuperação”. c. Abaixo de 5: exiba “reprovado direto”.