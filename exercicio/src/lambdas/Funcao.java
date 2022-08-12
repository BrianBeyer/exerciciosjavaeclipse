package lambdas;

import java.util.function.Function;

public class Funcao {
//na function � possivel definir o tipo de parametro e outro tipo de saida
	public static void main(String[] args) {
		
		//primeiro � o tipo que � recebido e o segundo � a saida <entrada, saida>
		//esse exemplo vai retornar se o numero � par ou impar
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par":"Impar" ;
		//operador ternario
		
		//o resultado de parOuImpar entra como parametro em valor
		Function<String, String> resultado = valor -> "O valor � "+ valor;
		
		//composicao de funcoes, usando uma funcao encadeando a outra
		//"O valor � "+ valor � passado para vaor e concatenado com o !!!
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";
		
		//andThen chama uma funcao
		String resultadoFinal1 = parOuImpar.andThen(resultado).andThen(empolgado).apply(4004);
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = parOuImpar.andThen(resultado).andThen(duvida).apply(4004);
		System.out.println(resultadoFinal2);
	}
}
