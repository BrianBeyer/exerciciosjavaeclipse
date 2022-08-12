package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {

		DesafioFilterCarro c1 = new DesafioFilterCarro("Fiat", 60.5, false);
		DesafioFilterCarro c2 = new DesafioFilterCarro("Ferrari", 245.0, true);
		DesafioFilterCarro c3 = new DesafioFilterCarro("VW", 75.0, false);
		DesafioFilterCarro c4 = new DesafioFilterCarro("Lamborguini", 259.9, true);

		List<DesafioFilterCarro> carro = Arrays.asList(c1, c2, c3, c4);
		Predicate<DesafioFilterCarro> esportivo = e -> e.esportivo;
		Predicate<DesafioFilterCarro> velocidade = v -> v.velocidade >= 230;
		Function<DesafioFilterCarro, String> resultado = a -> "O carro da marca "
				+a.carro+" é um super esportivo com velocidade "+a.velocidade+"Km/h";
				
		System.out.println("   ---Carros aprovados---");
		carro.stream()
		.filter(velocidade)
		.filter(esportivo)
		.map(resultado)
		.forEach(System.out::println);
		
	}
}
