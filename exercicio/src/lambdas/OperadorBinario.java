package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		
		double x = 3.3;
		double y = 8.5;
				
		//tanto o retorno como os parametros sao do mesmo tipo
		//recebe dois parametros e retorna um
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) /2;//apos o -> vem o retorno
		
		System.out.println(media.apply(x, y));
		
		//define cada tipo do parametro e o tipo do retorno
		//vai receber as duas notas
		BiFunction<Double, Double, String> resultado = 
		(n1, n2) -> { double notaFinal = (n1 + n2) / 2;
		return notaFinal >= 6 ? "Aprovado":"Reprovado";
		};
		System.out.println(resultado.apply(x, y));
		
		//um parametro e um retorno a ser definido
		//recebe a media como parametro
		Function<Double, String> conceito = m -> m >=7 ? "Aprovado":"Reprovado";
		System.out.println(media.andThen(conceito).apply(10.0, 7.5));
	}
}
