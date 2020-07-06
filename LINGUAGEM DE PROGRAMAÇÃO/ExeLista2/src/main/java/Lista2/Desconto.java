package Lista2;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Codigos de desconto \n 1 5%\n 2 10%\n 3 20%\n 4 50%");
       
        System.out.println("Qual o valor do produto escolhido?");  
        Double valor = leitor.nextDouble();
        
        System.out.println("Qual o código de desconto?");
        Integer desconto = leitor.nextInt();
        
        switch(desconto){
            case 1:
                System.out.println("O valor do produto é " + valor + 
                " e com o cupom escolhido é " + (valor - (valor * 0.05)));
        break;
            case 2:
                System.out.println("O valor do produto é " + valor + 
                " e com o cupom escolhido é " + (valor - (valor * 0.10)));
        break;
            case 3:
                System.out.println("O valor do produto é " + valor + 
                " e com o cupom escolhido é " + (valor - (valor * 0.20)));
        break;
            case 4:
                System.out.println("O valor do produto é " + valor + 
                " e com o cupom escolhido é " + (valor - (valor * 0.50)));
        break;
            default:
                System.out.println("Cupom de desconto invalido!");
        break;        
        }
        
 }
}
