package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
//predicate recebe um valor e retorna um boolean
	
	Predicate<Integer> variavelIsPar = num -> num % 2 == 0;
	//se o resto da divisao por 2 de num for 0, variavelispar recebe verdadeiro
	
	//para verificar se o numero tem 3 digitos
	Predicate<Integer> isTresNum = num -> num >= 100 && num <= 999;
	
	//retorna verdadeiro se for par e numero com tres digitos
	System.out.println(variavelIsPar.and(isTresNum).test(123));
	
	//retorna verdadeiso se for par ou se numero com tres digitos
	System.out.println(variavelIsPar.or(isTresNum).test(123));
	}
}
