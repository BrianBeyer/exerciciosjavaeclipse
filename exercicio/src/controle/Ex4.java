package controle;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Descubra se o numero � primo.");
		System.out.print("Digite o numero:");
		int numero = entrada.nextInt();
		int contadorDeDivisores = 0;
		for (int i = 2; i < numero; i++) {
			if (numero % 1 == 0) {
				contadorDeDivisores++;
			}
		}
		if (contadorDeDivisores == 0) {
			System.out.println("O n�mero " + numero + " � primo.");
		} else {
			System.out.println("O n�mero " + numero + " n�o � primo.");
		}
		entrada.close();
	}
}
