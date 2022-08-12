package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
//como percorrer uma coleção
	public static void main(String[] args) {
		
		//criando uma lista recebendo elementos
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Juju");
		
		System.out.println("Forma tradicional de mostrar a lista:");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		//percorrendo a lista com foreach com lambda
		System.out.println("\nPercorrendo com Lambda 1:");
		aprovados.forEach((variavelNome2) -> {System.out.println(variavelNome2);} );
		//se so tiver um parametro, a variavel pode ficam sem os parenteses
		
		System.out.println("\nPercorrendo com Lambda 2:");
		aprovados.forEach(variavelNome3 -> meuImprimir(variavelNome3) );//meuImprimir vem do metodo static abaixo
		//aqui é passada uma funçao como parametro
		
		System.out.println("\nMethod Reference...");//outro jeito de percorrer a lista
		aprovados.forEach(System.out::println);
		
		System.out.println("\nMethod Reference 2...");
		aprovados.forEach(Foreach::meuImprimir);//chamando funçao
	}
	static void meuImprimir(String nome) {
		System.out.println("Meu nome é "+nome);
	}
}
