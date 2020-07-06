package clube;

public class Time1 {
     private Integer vitoria = 0, derrota = 0, empate = 0, pontos= 0, pontosE = 0;
    private Integer vitoriaCor = 0, derrotaCor = 0, empateCor = 0, pontosVCor = 0, pontosECor = 0;
     public void Ganhar() {
        vitoria += 1;
        pontos += 3;     
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
        return pontos;
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
//------------------------------------------------------------------------------------------------------------------
      public void GanharCor() {
        vitoriaCor += 1;
        pontosVCor += 3;     
}
     public Integer getGanharCor(){
        return vitoriaCor;
    }
      
     public void EmpatarCor(){
      empateCor +=1;
      pontosECor +=1;
     }   
     
     public Integer getEmpatarCor(){
        return empateCor;
     }

      public Integer pontuacaoCor(){
        return pontosVCor;
      }

        public Integer pontuacaoECor(){
        return pontosECor;
    }
      
        public void PerderCor(){
            derrotaCor =+1;
            
   }
       
     public Integer getPerderCor(){
        return derrotaCor;
     }
     

}     