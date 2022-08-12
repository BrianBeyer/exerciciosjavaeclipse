package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import colecoes.Lista;

public class CriandoStreams {
	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		
		//of é um dos metodos estaticos para criaçao da stream
		Stream<String> linguagens = Stream.of("Java ", "JS ","Python\n");
		linguagens.forEach(print);
		
		//criando um stream a partir de um array
		String[] maisLinguagens = {"C ", "C++ ", "Go\n"};
		Stream.of(maisLinguagens).forEach(print);
		
		//criando uma stream com a classe arrays
		Arrays.stream(maisLinguagens).forEach(print);
		
		//criando array com indices
		Arrays.stream(maisLinguagens, 1, 2).forEach(print);
		//mostra o indice 1 e para no 2, nao exibindo o 2
		
		//criando uma stream a partir das colections
		List<String> outrasLing = Arrays.asList("\nPHP ", "Kotlin ", "Lua\n");
		outrasLing.stream().forEach(print);
		//dados paralelos nao sao executados na ordem e sim paralelamente
		outrasLing.parallelStream().forEach(print);
		
		//generate cria uma stream infinita sem ordenaçao
		//Stream.generate(() -> "a").forEach(print);
		//() sem parametro
		// "a" é o retorno
		//aqui gerara um programa infinito com repetidos aaaaaaaa
		
		//outra forma de gerar uma stream infinita
		//Stream.iterate(0, n -> n+1).forEach(print);
		//para funcionar o parametro do consumer deve ser Integer e nao String
		//começa com 0 e vai somando n+1 infinitas vezes
	}
}
