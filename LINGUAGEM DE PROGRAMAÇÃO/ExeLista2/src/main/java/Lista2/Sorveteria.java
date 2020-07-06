
package Lista2;

import java.util.Scanner;
public class Sorveteria {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("O que você deseja \n 1 Casquinha \n 2 Sundae ou \n 3 Milkshake");
        Integer produto = leitor.nextInt();
       
        switch(produto){
                case 1:
        System.out.println("A casquinha custa R$ 2,00 reais");    
    break;
                case 2:
        System.out.println("O sundae custa R$ 5,00 reais");
    break;
                case 3:
        System.out.println("O milkshake custa R$ 7,00 reais");
       
    }
}

    }

