package com.mycompany.exercicio.aluno;

public  class AlunoFundamental extends Aluno {
    private Double nota1, nota2, nota3, nota4;

    public AlunoFundamental(Double nota1, Double nota2, Double nota3, Double nota4, String nome, Integer ra) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    @Override
    public Double calculaMedia() {
        return (this.nota1 + this.nota2 + this.nota3 + this.nota4)/ 4;
    }

    @Override
    public String toString() {
        return "Aluno fundamental\n"
                +super.toString()
                +"\nota 1" + nota1
                +"\nota 2" + nota2
                +"\nota 3" +  nota3
                +"\nota 4" + nota4;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public Double getNota4() {
        return nota4;
    }



}
