package controle;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual ano voc� quer saber se � bissexto? ");
		int ano = entrada.nextInt();
		if (ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0)) {
			System.out.println("O ano � bissexto.");
		} else {
			System.out.println("O ano n�o � bissexto.");
		}

		entrada.close();

	}
}
