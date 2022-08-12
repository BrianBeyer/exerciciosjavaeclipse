package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> soma = (ac, n) -> ac+n;
		//ac acumulador, n numero
		//para somar todos os numeros da lista
		
	Integer total =	nums.stream().reduce(soma).get();//get para pegar o resultado gerado
	System.out.println(total);
	
	Integer total2 = nums.stream().reduce(100, soma);
	System.out.println(total2);
	//aqui o 100 é o valor inicial usado na operaçao
	
	nums.stream()
	.filter(n -> n>5)//filtro de somar so os numeros maiores que 5
	.reduce(soma)
	.ifPresent(System.out::println);// se o valor estiver presente
	}
}
