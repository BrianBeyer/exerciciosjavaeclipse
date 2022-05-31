package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual foi a nota?");
		int nota = entrada.nextInt();
		String media = "";

		switch (nota) {
		case 10:case 9:
			media = "A";
			break;
		case 8: case 7:
			media = "B";
			break;
		case 6: case 5:
			media = "C";
			break;
		case 4: case 3:
			media = "D";
			break;
		case 2: case 1: case 0:
			media = "F";
			break;
			default:
				media = "Invalida";
		}
		System.out.println("A média foi "+ media);

		entrada.close();

	}
}
