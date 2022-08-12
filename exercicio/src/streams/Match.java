package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Kiko", 4.4);
		Aluno a3 = new Aluno("Gui", 3.5);
		Aluno a4 = new Aluno("Pri", 9.0);
//no match pode verificar se todos os alunos foram aprovados
//ou se um aluno foi aprovado
//ou se nenhum aluno foi aprovado
//funcao match sao terminadoreas, nao é possivel fazer outra funcao apos ela
		List<Aluno> aluno = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		System.out.println("Todos os alunos foram aprovados?" + aluno
				.stream().allMatch(aprovado));
		// allMatch retorna verdadeiro ou falso se aluno da match com o aprovados
		// se todos os alunos combinam com aprovados, portanto se todos os alunos foram
		// aprovados

		System.out.println("Algum aluno foi aprovado?" + aluno.stream().anyMatch(aprovado));
		// match se algum aluno foi aprovado

		System.out.println("Nenhum aluno foi aprovado?" + aluno.stream().noneMatch(aprovado));
		// falso pois algum aluno foi aprovado
		
		System.out.println("Nenhum aluno foi reprovado?" + aluno.stream().noneMatch(reprovado));
	}
}
