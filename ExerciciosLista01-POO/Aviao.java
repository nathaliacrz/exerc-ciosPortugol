package ProgramacaoOO;

public class Aviao {

	int anoFabricacao;
	int combustivelCompleto;
	int revisoesEmDia;
	
	public void podeDecolar() {
		if(combustivelCompleto == 1 && revisoesEmDia == 1) {
			System.out.println("O avi�o est� apto para decolar.");
		} else if(combustivelCompleto == 2 && revisoesEmDia == 1) {
			System.out.println("O avi�o precisa ser abastecido para seguir viagem.");
		} else if(combustivelCompleto == 1 && revisoesEmDia == 2) {
			System.out.println("O avi�o n�o est� regulamentado, por favor fa�a a revis�o antes de seguir viagem.");
		} else if(combustivelCompleto == 2 && revisoesEmDia == 2) {
			System.out.println("O avi�o precisa ser abastecido e revisado antes de realizar viagem.");
		}
	}
}
