
package com.mycompany.desafio.conta.corrente;

public class Historico {

 //Atributos aqui
        private Integer dia;
        private Integer mes;
        private Integer ano;
	private String operacao;        
	private Double valor;

  //Construtor  aqui  
    public Historico(String operacao, Double valor, Integer dia, Integer mes, Integer ano) {
        this.operacao = operacao;
        this.valor = valor;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
  
    @Override
    public String toString() {
        return "Historico{"
    + "" + "operacao=" + operacao + ", valor=" + valor + 
                ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }
        
}

    
