
package com.mycompany.funcionarios;

public class Professor  extends Funcionario{

    public Professor(String nome, String cpf, Double salario) {
        super(nome, cpf, salario);
    }
    
    public void reajustarSalario(){// metodo exclusivo de professor
    this.salario += this.salario * 0.10;
    }
    
    
}
