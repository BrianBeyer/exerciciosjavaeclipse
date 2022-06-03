package controle;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a palavra:");
		String palavra = entrada.nextLine();

		char letra[] = palavra.toCharArray();

		for (int i = 0; i < letra.length; i++) {
			System.out.println(letra[i]);
		}
		entrada.close();
	}
}
