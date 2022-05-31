package controle;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		// sem o break, ele executo o caso selecionado e todos os proximos abaixo

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual sua faixa do Karate?");
		String faixa = entrada.nextLine();
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sabe o Bassai");
		case "marro":
			System.out.println("Sabe o Tekki");
		case "roxa":
			System.out.println("Sabe o Godan");
		case "verde":
			System.out.println("Sabe o Yodan");
		case "laranja":
			System.out.println("Sabe o Sandan ");
		case "vermelha":
			System.out.println("Sabe o Nidan");
		case "Amarela":
			System.out.println("Sabe o Shodan");
		default:
			System.out.println("Fim");
		}

		entrada.close();
	}
}
