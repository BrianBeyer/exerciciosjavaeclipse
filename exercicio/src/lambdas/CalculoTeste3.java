package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
//usando Double, os numeros devem ser colocado com ponto = 1.0
		//operacao que recebe dois parametros de entrada do mesmo tipo e retorna
		//um parametro do mesmo tipo, nao precisando de inteface
		BinaryOperator<Double> calc = (x, y) -> {return x + y;};
		System.out.println(calc.apply(4.0, 6.0));
		
		calc = (x, y) -> x * y;//o return fica implicito 
		System.out.println(calc.apply(4.0, 6.0));
	
		//o parametro recebido e o resultado depende do que é colocando entre as <>
		BinaryOperator<Integer> calc2 = (x, y) -> {return x + y;};
		System.out.println(calc2.apply(5, 8));
		
		calc = (x, y) -> x * y;//o return fica implicito 
		System.out.println(calc2.apply(43, 2));
	
	
	}

}
