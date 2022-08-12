package excecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		System.out.print("Insira o numero: ");
		// finally sera executado se passar pelo erro ou nao
		// serve para forçar uma execuçao
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalmente...");
			entrada.close();
		}
		System.out.println("Fim");
	}
}
