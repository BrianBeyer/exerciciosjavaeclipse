package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Que dia da semana é hoje? ");

		String dia = entrada.next();// so next pega so a primeira palavra digitada

		if (dia.equalsIgnoreCase("domingo")){ //para ignorar se a letra é maiuscula ou nao
			System.out.println("Dia da semana 1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("Dia da semana 2");
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("Dia da semana 3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("Dia da semana 4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("Dia da semana 5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("Dia da semana 6");
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println("Dia da semana 7");
		}
		
		//outra possibilidade "domingo".equals(dia.toLowerCase()) //deixa o que foi digitado em minusculo para comparar
		
		entrada.close();
	}
}
