package controle;

import java.util.Scanner;
import java.util.Random;

public class Ex6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando um numero...");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			System.out.println("Começou o jogo...");
			tentativas=0;
			do {
				tentativas++;
				System.out.println("Tentativa "+tentativas);
				System.out.print("Adivinhe o número: ");
				numero = entrada.nextInt();
			
			if(numero>numeroSorteado) {
				System.out.println("\nO numero sorteado é menor que "+numero);
			}else if(numero<numeroSorteado) {
				System.out.println("\nO numero sorteado é maior que "+numero);
			}else {
				System.out.println("Acertou em "+tentativas+" tentativas!\n");
				
				}
			
			}while(numero!=numeroSorteado);
			System.out.println("Digite 0 para sair ou qualquer numero para continuar");
			continuar = entrada.nextInt();
		}while(continuar !=0);
		
			entrada.close();
		

	}
}
