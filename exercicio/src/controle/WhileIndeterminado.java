package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while (!valor.equalsIgnoreCase("sair")){// enquanto o valor nao for sair, fa�a
			System.out.print("Voc� diz: ");
			valor = entrada.nextLine();
		}
		System.out.println("Terminado");
		entrada.close();
	}
}
