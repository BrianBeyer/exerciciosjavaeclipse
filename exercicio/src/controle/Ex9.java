package controle;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		int contador = 0;
		do {
			System.out.println("Digite um valor: ");
			int num = entrada.nextInt();
			if (num > maior) {
				maior = num;
			}
			contador++;
		} while (contador != 10);
		System.out.println("O maior valor é: " + maior);
		entrada.close();
	}
}
