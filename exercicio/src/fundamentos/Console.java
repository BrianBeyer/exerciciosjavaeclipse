package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);// para o usuario digitar dados

		System.out.print("Nome do cliente: ");
		String nome = entrada.nextLine();// para o usuario digitar um valor string
		System.out.print("Numero de compras do cliente: ");
		int compra = entrada.nextInt();
		System.out.print("Valor total da compra: ");
		int valor = entrada.nextInt();

		System.out.printf("O senhor %s comprou %d produtos e o valor é R$%d.", nome, compra, valor);
		
		entrada.close();
	}
}
