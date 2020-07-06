
package com.mycompany.desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {  
 
//Criando os atributos
    private Double saldo;
    private String titular;

//Criando o construtor
    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
     
    }
    

//Criando os métodos
    List lista = new ArrayList<Historico>();
    
    public void depositar(Integer dia, Integer mes, Integer ano, Double valor) {
        this.saldo += valor;
         lista.add(new Historico("Depositar", valor, dia, mes, ano));
    }

public void sacar(Integer dia, Integer mes, Integer ano, Double valor) {
	this.saldo -= valor;
        lista.add(new Historico("Sacar", valor, dia, mes, ano));
}

public void exibirExtrato() {
        System.out.println(String.format
        ("Exibir extrato saldo: R$ %d titular %s", this.saldo, this.titular));
}
    @Override
    public String toString() {
        return "ContaCorrente{" + "lista=" + lista + '}';
    }

 

}
    

    


        

