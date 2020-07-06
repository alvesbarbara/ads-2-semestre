
package com.mycompany.funcionarios;


public class ProgramaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Diego", "41998658880", 1000.0);
        Bombeiro bombeiro = new Bombeiro("Gabriel", "31277337989", 1500.0);
        Professor professor = new Professor ("Celia", "73898612230", 15000.0);
        
        funcionario.exibirDados();
        bombeiro.exibirDados();
        professor.exibirDados();
        
        bombeiro.apagarFogo();
        professor.reajustarSalario();
        
        
        
    }
    
}
