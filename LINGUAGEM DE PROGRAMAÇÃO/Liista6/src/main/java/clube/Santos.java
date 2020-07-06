
package clube;

public class Santos {
        private Integer vitoria = 0, derrota = 0, empate = 0, pontosV = 0, pontosE = 0;
     public void Ganhar() {
        vitoria += 1;
        pontosV += 3;     
}
     public Integer getGanhar(){
        return vitoria;
    }
      
     public void Empatar(){
      empate +=1;
      pontosE +=1;
     }   
     
     public Integer getEmpatar(){
        return empate;
     }

      public Integer pontuacao(){
        return pontosV;
      }

        public Integer pontuacaoE(){
        return pontosE;
    }
      
        public void Perder(){
            derrota =+1;
            
   }
       
     public Integer getPerder(){
        return derrota;
     }
    
}
