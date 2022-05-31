package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario R$");
		String sal1 = teclado.nextLine().replace(",", ".");
		double salnum1 = Double.parseDouble(sal1);
		
		System.out.print("Digite o segundo salario R$");
		String sal2 = teclado.nextLine().replace(",", ".");
		double salnum2 = Double.parseDouble(sal2);
		
		System.out.print("Digite o terceiro salario R$");
		String sal3 = teclado.nextLine().replace(",", ".");
		double salnum3 = Double.parseDouble(sal3);
		
		double soma = salnum1+salnum2+salnum3;
		
		System.out.println("A media dos salarios é R$"+ soma/3);
		
		teclado.close();
	}
}
