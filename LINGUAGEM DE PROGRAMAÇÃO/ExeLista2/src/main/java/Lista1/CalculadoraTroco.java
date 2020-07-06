package Lista1;

import java.util.Scanner;


public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual preço unitario do produto?");
         Double unitario = leitor.nextDouble();
          
        System.out.println("Qual a quantidade vendida?");  
         Double quantidade = leitor.nextDouble();
         
        System.out.println("Qual o valor pago pelo cliente?");
         Double valor = leitor.nextDouble();
         
         Double qtdVendida = unitario * quantidade;
         Double troco =  valor - qtdVendida ;
         
         if (valor >= quantidade){
            System.out.println("O troco será de " + troco);
         }
         else{
            System.out.println("Valor pago insuficiente");
         } 
    
}
}
  
