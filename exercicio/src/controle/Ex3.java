package controle;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Verifique a sutua��o do aluno.");
		System.out.print("Digite a primeira nota:");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota:");
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("M�dia " + media + "\nAprovado ");
		} else if (media >= 4) {
			System.out.println("M�dia " + media + "\nRecupera��o ");
		} else {
			System.out.println("M�dia " + media + "\nReprovado ");
		}

		entrada.close();
	}
}
