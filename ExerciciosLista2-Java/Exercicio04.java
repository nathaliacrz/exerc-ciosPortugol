import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		double numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			double raizQ = Math.sqrt(numero);
			System.out.printf("O n�mero %.2f � par e o valor da raiz quadrada � de %.2f.", numero, raizQ);
		} else if(numero % 2 != 0) {
			double aoQuadrado = Math.pow(numero, 2);
			System.out.printf("O n�mero %.2f � �mpar e o valor do n�mero elevado ao quadrado � de %.2f.", numero, aoQuadrado);
		}

		
		sc.close();
	}
}
