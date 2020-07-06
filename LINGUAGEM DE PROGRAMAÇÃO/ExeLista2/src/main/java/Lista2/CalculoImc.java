package Lista2;

import java.util.Scanner;

public class CalculoImc {
     public static void main (String[] args){
         Scanner leitor = new Scanner(System.in);
    
         System.out.println("Qual sua altura?");  
          Double altura = leitor.nextDouble();
          
         System.out.println("Qual seu peso?");  
          Double peso = leitor.nextDouble();
          
         System.out.println("Qual seu sexo 1 Para Feminino 2 para Masculino"); 
          Double sexo = leitor.nextDouble(); 
          
        Double formula = peso/(altura*altura);
        
        if(formula < 18.05){
            System.out.println("Seu IMC é" + formula + " você está abaixo do peso");
        }else if(formula >= 18.05 && formula <25){
            System.out.println("Seu IMC é" + formula + " e seu peso é normal");
        }else if(formula >=25 && formula <30){
            System.out.println("Seu IMC é" + formula + " você esta com sobrepeso");
        }else if(formula >=30 && formula <35){
            System.out.println("Seu IMC é" + formula + " você esta com obesidade grau 1 ");     
        }else if(formula >=35 && formula <40){
            System.out.println("Seu IMC é" + formula + " você esta com obesidade grau 2 ");     
        }else if(formula >=40){
            System.out.println("Seu IMC é" + formula + " você esta com obesidade grau 3 ");     
        }            
 }
}

//Crie uma classe chamada “IndiceMassaCorporal” que:
//A. Solicite a altura e peso do usuário.
//B. Solicite o sexo, deve ser:
//1 - Mulher 2 - Homem. C. Calcule o IMC do usuário.
//D. Exiba a Condição de saúde da pessoa baseada em seu IMC. 
//IMC               	  Resultado
//Menos do que 18,5	  Abaixo do peso
//Entre 18,5 e 24,9	  Peso normal
//Entre 25 e 29,9	  Sobrepeso
//Entre 30 e 34,9	  Obesidade grau 1
//Entre 35 e 39,9  	  Obesidade grau 2
//Mais do que 40	  Obesidade grau 3