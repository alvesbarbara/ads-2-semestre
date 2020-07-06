
package Lista3;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer valorDigitado, total = 0;

        do {

            System.out.println("Digite um número:");

            valorDigitado = leitor.nextInt();

            total += valorDigitado;

        } while (!(valorDigitado.equals(0)));

        System.out.println(String.format("Total acumulado: %d", total));
    }
       
    }
//%s = String
//%d = Inteiro
//%f = número com ponto flutuante. Na verdade o "f" representa a vírgula.
//\t = tabulação
//\n = pular linha

