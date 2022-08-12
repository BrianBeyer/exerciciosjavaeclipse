package lambdas;

import java.util.function.Function;

public class Funcao {
//na function é possivel definir o tipo de parametro e outro tipo de saida
	public static void main(String[] args) {
		
		//primeiro é o tipo que é recebido e o segundo é a saida <entrada, saida>
		//esse exemplo vai retornar se o numero é par ou impar
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par":"Impar" ;
		//operador ternario
		
		//o resultado de parOuImpar entra como parametro em valor
		Function<String, String> resultado = valor -> "O valor é "+ valor;
		
		//composicao de funcoes, usando uma funcao encadeando a outra
		//"O valor é "+ valor é passado para vaor e concatenado com o !!!
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";
		
		//andThen chama uma funcao
		String resultadoFinal1 = parOuImpar.andThen(resultado).andThen(empolgado).apply(4004);
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = parOuImpar.andThen(resultado).andThen(duvida).apply(4004);
		System.out.println(resultadoFinal2);
	}
}
