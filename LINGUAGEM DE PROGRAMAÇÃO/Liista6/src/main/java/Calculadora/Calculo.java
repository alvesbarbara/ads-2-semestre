
package Calculadora;


public class Calculo {
    
     
     Double numero = 0.0, numero2 = 0.0, soma = 0.0;
     
     void Soma() {
		soma += numero + numero2;
                
	}
     
     public Double getSoma() {
        return soma ;
}
    
     public Double getMultiplo(){
        return soma;
    }
     void Multiplicacao() {
		soma = numero * numero2;
                
	}
      
      public Double getDivisao(){
        return soma;
    }
      
      void Divisao() {
		soma = numero / numero2;
	}
      
       public Double getSubitracao(){
        return soma;
    }
   void Subtracao() {
		soma -= numero - numero2;
	}
}	