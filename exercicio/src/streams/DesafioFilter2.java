package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	public static void main(String[] args) {

		Produtos p1 = new Produtos("Telemovel", 1800.0, 5.0, false);
		Produtos p2 = new Produtos("TV", 4500, 30, true);
		Produtos p3 = new Produtos("Cama", 1500, 40, false);
		Produtos p4 = new Produtos("Laptop", 5400, 40.5, true);

		System.out.println("Produtos com 30% de desconto ou mais com pfrete gratis");
		List<Produtos> produtos = Arrays.asList(p1,p2,p3,p4);
		Predicate<Produtos> frete = f -> f.freteGratis;
		Predicate<Produtos> desconto = d -> d.desconto >= 30;
		Function<Produtos, String> resultado = r -> r.nome+" com "+r.desconto+
				"% de desconto por US$"+r.preco;
		
		produtos.stream()
		.filter(frete)
		.filter(desconto)
		.map(resultado)
		.forEach(System.out::println);
		
		
		
	
	}
}
