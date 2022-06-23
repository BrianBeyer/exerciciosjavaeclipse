package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas vai inserir?");
		int quantNotas = entrada.nextInt();

		double notasAluno[] = new double[quantNotas];

		for (int c = 0; c < notasAluno.length; c++) {
			System.out.print("Insira a " + (c + 1) + "° nota: ");
			notasAluno[c] = entrada.nextDouble();
		}

		System.out.println("As notas são: ");
		double total = 0;
		for (double notas : notasAluno) {
			total += notas;
			System.out.print("[" + notas + "]" + " ");
		}
		System.out.println("\nA média é: " + total / quantNotas);

		entrada.close();
	}
}
