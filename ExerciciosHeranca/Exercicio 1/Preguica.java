package exerciciosHeranca;

import java.util.Scanner;

public class Preguica extends Animais{

	Scanner entrada = new Scanner(System.in);

	int sobeArvore;
	
	public void subirArvore() {
		System.out.println("Qual o nome da preguicinha?");
		setNome(entrada.next());
		System.out.println("Qual a idade?");
		setIdade(entrada.nextInt());
		System.out.println("Qual o som?");
		setSom(entrada.next());	
		System.out.println("A bonita viu uma �rvore?\n1- Sim.\n2- N�o.");
		sobeArvore = entrada.nextInt();
		if(sobeArvore == 1) {
			System.out.println("Certeza que ta l� pendurada s� procurar.");
		} else if(sobeArvore == 2) {
			System.out.println("Ela � pregui�osa mas s� n�o subiu em uma porque n�o achou mesmo.");
		}
	}

	
	
	
	
}
