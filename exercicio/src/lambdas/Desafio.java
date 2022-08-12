package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
				
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);

		UnaryOperator<Double> imposto = imp -> imp >= 2500 ? imp * 1.085 : imp + 0;

		UnaryOperator<Double> frete = f -> f >= 3000 ? f + 100.0 : f + 50.0;

		UnaryOperator<Double> arredondar = pre -> Double.parseDouble(String.format(Locale.ENGLISH, "%.2f", pre));

		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

		Produto p = new Produto("Ipad", 3235.89, 0.5);

		String preco = precoFinal.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);

		System.out.println("O preço final é " + preco);

		// a partir do produto, calcular o preço real(com desconto)
		// imposto >= 2500(8,5%) / < 2500 isento
		// frete >= 3000 (100 reais) / <3000 (50reais)
		// aredondar para 2 casas depois da virgula
		// formatar R$1234,56
	}
}
