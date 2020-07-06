
package com.mycompany.funcionarios;

public class Bombeiro extends Funcionario {// extends "NomeClasse" chama as informações

  public Bombeiro(String nome, String cpf, Double salario) {
        super(nome, cpf, salario);// super chamando a suoer classe ou classe pai
    }
    
    public void apagarFogo(){
        System.out.println("Apaganfo o fogo");
    }
}
