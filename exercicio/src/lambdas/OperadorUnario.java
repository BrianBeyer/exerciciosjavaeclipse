package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		// o tipo de parametro passado vai ser o mesmo tipo de retorno
		// possivel fazer encadeamento de varias chamadas

		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		//o numero passa por todas as funcoes e retorna o resultado
		System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(10));
		
		//compose faz a operacao contraria do andthen
		//antes de executar aoQuadrado execute vezesDois e antes 
		//de executar vezesDois execute maisDois
		System.out.println(aoQuadrado.compose(vezesDois).compose(maisDois).apply(10));
	}
}
