package controle;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Até qual número você quer contar? (de 0 a 100)");
		int cont = entrada.nextInt() + 1;
		for (int i = 0; i <= 100; i++) {
			if (i == cont) {
				break;
			}
			System.out.println(i + " ");
		}
		entrada.close();
	}
}
