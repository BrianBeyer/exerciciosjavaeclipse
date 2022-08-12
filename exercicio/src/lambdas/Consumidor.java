package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
//da funcao consumer
//recebe um paremetro e retorna vazio
	public static void main(String[] args) {

		// produto é o tipo de parametro a ser recebido da outra classe
		Consumer<Produto> imprimir = p -> System.out.println(p.nome+ "!!!");
		
		Produto p1 = new Produto("Caneta", 12.33, 0.09);
		imprimir.accept(p1);//metodo vai receber o produto e so recebe um parametro
		
		Produto p2 = new Produto("Mesa", 300.99, 0.15);
		Produto p3 = new Produto("Cadeira", 25.55, 0.05);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		
		produtos.forEach(imprimir);//passando consumer como parametro
		produtos.forEach(p-> System.out.println(p.preco));//mostrar o preço
		produtos.forEach(System.out::println);//mostra o metodo toString
	}
}