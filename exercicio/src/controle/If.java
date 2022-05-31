package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a media: ");
		Double media = entrada.nextDouble();
		if(media<=10&&media >=7) {//a media tem q ser menor ou igual a 10 
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		
		entrada.close();
	}
}
