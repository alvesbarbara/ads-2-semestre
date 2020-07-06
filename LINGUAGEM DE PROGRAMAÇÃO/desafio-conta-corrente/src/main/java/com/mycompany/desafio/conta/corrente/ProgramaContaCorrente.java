
package com.mycompany.desafio.conta.corrente;


public class ProgramaContaCorrente {
     //Criando a classe executavel
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Barbara", 1000.00);
        
        conta.depositar(10, 1, 20, 100.00);
        System.out.println(conta.lista);
        
        
        conta.sacar(17, 01, 20, 20.00);
        System.out.println(conta.lista);
        
        conta.exibirExtrato();
        
        
       
        
        
       
}
}    
