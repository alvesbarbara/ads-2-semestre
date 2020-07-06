
package com.mycompany.funcionarios;

public class Funcionario { //construtor não é herdado e sim invoca-lo
   
    protected String nome; // modificador de acesso que permite o acesso ao atributo
    protected String cpf;// sempre declarar documentos como string para evitar erros
    protected Double salario;
    
    public Funcionario(String nome, String cpg, Double salario){
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
        
    
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public Double getSalario(){
    return salario;
    }
    
    public void exibirDados(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(salario);
       
    }
    
}
