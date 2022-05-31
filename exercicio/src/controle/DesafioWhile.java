package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double nota = 0;
		double notatot = 0;
		int total = 0;

		while (nota != -1) {
			System.out.print("Digite a nota ou -1 para sair: ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				notatot += nota;
				total++;
			} else if (nota != -1) {
				System.out.println("Nota invalida");
			}
		}

		System.out.println("Foram digitadas " + total + " notas e a media é " + notatot / total);
		entrada.close();
	}
}
