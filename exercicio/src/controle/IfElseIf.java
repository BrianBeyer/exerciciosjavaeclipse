package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a nota: ");

		double nota = entrada.nextDouble();

		if (nota < 0 || nota > 10) {// para verificar se a nota � menor que zero ou maior que dez
			System.out.println("Nota invalida!");
		} else if (nota >= 8.1) {
			System.out.println("Nota A");
		} else if (nota >= 6.1) {
			System.out.println("Nota B");
		} else if (nota >= 4.1) {
			System.out.println("Nota C");
		} else if (nota >= 2.1) {
			System.out.println("Nota D");
		} else {
			System.out.println("Nota E");
		}

		entrada.close();
	}
}
