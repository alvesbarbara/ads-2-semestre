package Lista1;
import java.util.Scanner;

public class CalculadoraSalario {
     public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         
         System.out.println("Digite seu salario");
          Double salario = leitor.nextDouble();
          
         System.out.println("Digite o valor do imposto a pagar"); 
         Double imposto = leitor.nextDouble();
         
         Double resultado = salario - (salario * (imposto/100));
         
         System.out.println("Seu salario bruto é " + salario +
                  " e seu salario liquido é de " + resultado);
         
    }
    
}



//D. Exiba o valor do salário líquido. Por exemplo:
//Se o salário for 1000,00, e o imposto for de 20%, o salário líquido será 800,00.