package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Kiko", 4.4);
		Aluno a3 = new Aluno("Gui", 3.5);
		Aluno a4 = new Aluno("Pri", 9.0);

		List<Aluno> aluno = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
				if(aluno1.nota > aluno2.nota) return 1;
				if(aluno1.nota < aluno2.nota) return -1;
				return 0; //caso contrario
		};//compara duas coisas
		//se retornar 1, o primeiro objeto é maior que o segundo
		//se retornar -1, o segundo é maior que o primeiro
		//se retornar 0[zero], os dois objetos sao iguais
		System.out.println("Melhor nota:");
		System.out.println(aluno.stream().max(melhorNota).get());
		
		System.out.println("Pior nota:");
		System.out.println(aluno.stream().min(melhorNota).get());
	}
}
