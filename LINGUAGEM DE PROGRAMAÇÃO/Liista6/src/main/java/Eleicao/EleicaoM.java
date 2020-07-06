
package Eleicao;


public class EleicaoM {
    private Integer votos = 0, votos2 = 0, total = 0;
	private String ganhador = "";
	
	void votoCandidado1() {
		votos += 1;
	}
	void votoCandidato2() {
		votos2 += 1;
	}
        
	public void votacaoFinal() {
		if(votos > votos2) {
			ganhador = "Canditado 1 venceu!";
		}else if(votos2 > votos){
			ganhador = "Canditado 2 venceu!";
		}else {
			ganhador = "empate";
		}
	}
	
	public void resultadoTotal() {
		total = votos + votos2;
	}
	
	public Integer getVotoCandidado1() {
		return votos;
	}
	
	public Integer getVotoCandidato2() {
		return votos2;
	}
	
	public void setvotoCandidato1(Integer votos1) {
		this.votos = votos1;
	}
	
	public void setvotoCandidato2(Integer votos2) {
		this.votos2 = votos2;
	}
	
	public String getGanhador() {
		return ganhador;
	}
	
	public void setGanhador(String ganhador) {
		this.ganhador = ganhador;
	}
	
	public Integer getTotal() {
		return total;
	}
}
