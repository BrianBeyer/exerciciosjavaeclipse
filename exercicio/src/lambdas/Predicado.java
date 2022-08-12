package lambdas;

import java.util.function.Predicate;

public class Predicado {
//da lista de interfaces funcionais
	public static void main(String[] args) {
		//predicado retorna verdadeiro ou falso
		Predicate <Produto> seECaro = prod -> (prod.preco *(1 - prod.desconto)) >= 750;//acessando a classe produto
		//se o produtor for maior ou igual a 750 ja com o desconto,é caro
		
		Produto produto = new Produto("Notebook", 3800.88, 0.15);//construtor
		System.out.println(produto.nome+" "+seECaro.test(produto));//se é caro recebe true
		
		Produto produto2 = new Produto("Lapis", 10, 0.1);
		System.out.println(produto2.nome+" "+seECaro.test(produto2));
		
	}
}
