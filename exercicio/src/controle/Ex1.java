package controle;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Verificador se o numero esta entre 0 e 10 e se � par.");
		System.out.print("Digite um numero:");
		String parouimpar = "";
		int num = entrada.nextInt();
		
		if(num % 2 == 0) {
			parouimpar = "par";
		}else {
			parouimpar = "impar";
		}
		if (num >= 0 && num <= 10) {	
			System.out.println("O n�mero "+num+" � "+parouimpar+" e est� entre 0 e 10.");
		}else {
			System.out.println("O n�mero "+num+" � "+parouimpar+" e n�o est� entre 0 e 10.");
		}

		entrada.close();
	}
}
