/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.aluno;

/**
 *
 * @author re92260z
 */
public  abstract class Aluno {
    private String nome;
    private Integer ra;

    public Aluno(String nome, Integer ra) {
        this.nome = nome;
        this.ra = ra;
    }
    
    public abstract Double calculaMedia();

    public String getNome() {
        return nome;
    }

    public Integer getRa() {
        return ra;
    }

    @Override
    public String toString() {
        return String.format("nome: %s \nra: \nmédia: %.2f",
                this.nome, this.ra, this.calculaMedia());
    }
    
    
}
