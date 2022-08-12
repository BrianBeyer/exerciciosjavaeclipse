package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {

		Consumer<String> print = System.out::print;

		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Fiat ");
		
		//map mapeia uma array e retorna com alguma modificaçao
		//aqui a marcas é mapeada, colocada a funcao de maiusculo e mostrar na tela
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//a variaver abaixo tem a funcao de deixar em maiusculo
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		//pega a primeira letra da palavra
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0)+ "";
		UnaryOperator<String> grito = n -> n + "!!!  ";
		
		System.out.println("\n\nUsando a composição");
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);
	}
}
