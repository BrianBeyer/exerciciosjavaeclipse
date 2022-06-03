package controle;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Descubra se o numero é primo.");
		System.out.print("Digite o numero:");
		int numero = entrada.nextInt();
		int contadorDeDivisores = 0;
		for (int i = 2; i < numero; i++) {
			if (numero % 1 == 0) {
				contadorDeDivisores++;
			}
		}
		switch(contadorDeDivisores) {
		case 0:
			System.out.println("O número " + numero + " é primo.");
			break;
			default:
				System.out.println("O número " + numero + " não é primo.");
		}

	}
}
