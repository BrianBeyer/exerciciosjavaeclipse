package controle;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		int soma = 0;
		while (num >= 0) {
			System.out.println("Digite um n�mero (n�mero negativo para sair): ");
			num = entrada.nextInt();
			if (num >= 0) {
				soma += num;
				System.out.println("Soma at� o momento �: " + soma);
			}
		}
		System.out.println("Fim...");
		entrada.close();
	}
}
