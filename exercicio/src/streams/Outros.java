package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {// outros metodos da API
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Kiko", 8.4);
		Aluno a3 = new Aluno("Gui", 9.1);
		Aluno a4 = new Aluno("Pri", 3.5);
		Aluno a5 = new Aluno("Bela", 7.0);
		Aluno a6 = new Aluno("Gui", 3.5);//nao vai se repetir no distinct
		Aluno a7 = new Aluno("Juquinha", 5.0);
		Aluno a8 = new Aluno("Cri", 1.0);
		List<Aluno> aluno = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		//distinct so retorna o que nao for repetido
		System.out.println("distinct...");
		aluno.stream().distinct().forEach(System.out::println);
		//deve usar na classe aluno o equals e hashcode
		
		System.out.println("\n skip e limit");
		aluno.stream()
		.distinct()
		.skip(2)//pula 2 elemento da lista e mostra em diante
		.limit(3)//mostra so os 3 proximos itens
		.forEach(System.out::println);
		
		System.out.println("\n takeWhile");
		//pegue elementos enquanto acontecer determinada condição
		aluno.stream()
		.distinct()
		.takeWhile(a -> a.nota >= 7)//pegue os elementos enquanto
		//a nota for maior ou igual a 7
		.forEach(System.out::println);
	}

}
