
package aula20_05_2020;

public class Corredor {
 private String tipoFisico;
 private String performace;
 private Double tempoMedio;
 
    public Corredor(String tipoFisico, String performace, Double tempoMedio){
    this.tipoFisico = tipoFisico;
    this.performace = performace;
    this.tempoMedio = tempoMedio;
    }
    
    public String getTipoFisico() {
        return tipoFisico;
    }

    public String getPerformace() {
        return performace;
    }

    public Double getTempoMedio() {
        return tempoMedio;
    }
 

 
 public void exibirDados(){
        System.out.println(tipoFisico);
        System.out.println(performace);
        System.out.println(tempoMedio);
       
    }
    
}
