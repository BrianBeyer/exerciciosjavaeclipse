package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		int c = 0;
		
		do {
			c++;
			System.out.println("Executando programa "+c+"° vez");
			System.out.println("Quer sair do programa?");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("sim"));
		System.out.println("programa terminado!!!");
		
		entrada.close();
	}
}
