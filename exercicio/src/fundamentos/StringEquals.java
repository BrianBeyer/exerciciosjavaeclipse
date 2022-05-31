package fundamentos;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
	
		System.out.println("2"=="2");
		//comparando dois valores
		
		String s1 = new String("2");
		System.out.println("2"== s1);
		//as strings acima nao sao iguais
		
		System.out.println("2".equals(s1));
		//equals compara apenas os conteudos
	
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.nextLine();
		System.out.println("2"==s2.trim());
		//acima,sera faldo pois os valores sao iguais mas o tipo é diferente
		
		System.out.println("2".equals(s2.trim()));
		//aqui sera verdadeiso pois so verificara o valor
		
		//trim() remove os espaços antes e apos do que foi digitado pelo usuario
		entrada.close();
	}
}
