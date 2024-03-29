package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Kiko", 4.4);
		Aluno a3 = new Aluno("Gui", 3.5);
		Aluno a4 = new Aluno("Pri", 9.0);

		List<Aluno> aluno = Arrays.asList(a1, a2, a3, a4);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);// da classe media
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

		Media media = aluno.stream()
		.filter(aprovado)
		.map(apenasNota)
		.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println("A media dos aprovados da turma �: "+media.getValor());
	}
}
