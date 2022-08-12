package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Kiko", 4.4);
		Aluno a3 = new Aluno("Gui", 3.5);
		Aluno a4 = new Aluno("Pri", 9.0);
		
		List<Aluno> aluno = Arrays.asList(a1,a2,a3,a4);
		Predicate<Aluno> aprovado = a -> a.nota >=7; //retorna boolean
		Function<Aluno, Double> apenasNota = a -> a.nota; //recebe o aluno e retorna a nota
		BinaryOperator<Double> somatoria = (a,b) -> a+b;
		
		aluno.parallelStream()
		.filter(aprovado)//filtra quem tirou nota maior ou igual a 7
		.map(apenasNota)//para mapear as notas
		.reduce(somatoria)//para somar todas as notas
		.ifPresent(System.out::println);//se tiver resultado presente
	}
}
