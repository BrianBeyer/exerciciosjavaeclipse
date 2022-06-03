package controle;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Verificador se o numero esta entre 0 e 10 e se é par.");
		System.out.print("Digite um numero:");
		String parouimpar = "";
		int num = entrada.nextInt();
		
		if(num % 2 == 0) {
			parouimpar = "par";
		}else {
			parouimpar = "impar";
		}
		if (num >= 0 && num <= 10) {	
			System.out.println("O número "+num+" é "+parouimpar+" e está entre 0 e 10.");
		}else {
			System.out.println("O número "+num+" é "+parouimpar+" e não está entre 0 e 10.");
		}

		entrada.close();
	}
}
