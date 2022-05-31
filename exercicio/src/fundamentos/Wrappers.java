package fundamentos;

import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		//Wrappers são a versão objeto dos tipos primitivos
		//Abaixo os tipos primitivos como objeto, colocando a primeira letra maiuscula
		
		Byte b = 100;
		Short s = 1000;
		
		Scanner entrada = new Scanner(System.in);
		
		Integer i = Integer.parseInt("10000"); //int = integer - converter um valor string para inteiro
		Integer ii = Integer.parseInt(entrada.next());
		Long l = 100000L;// necessario colocar o L
		//com isso é possivel usar as funcoes com ponto b.
		System.out.println(b.byteValue()); //para mostrar o valor de b
		System.out.println(s.toString());//converte para string o valor
		System.out.println(i*2);
		System.out.println(ii);
		System.out.println(l/3);
		
		entrada.close();
		
		Boolean bo = Boolean.parseBoolean("true");//valor string vai ser convertido em boolean
		System.out.println(bo.toString().toUpperCase());//transformando de volta em string para deixar tudo em maiusculo
		
		Character c = '?';//char
		System.out.println(c+"...");//esse retorno é uma string
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 12345.543;
		System.out.println(d);
	}
}
