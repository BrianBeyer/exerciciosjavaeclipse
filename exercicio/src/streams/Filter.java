package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
//com relaçao a classe aluno
	Aluno a1 = new Aluno("Ju", 4.4);
	Aluno a2 = new Aluno("Gui", 5.5);
	Aluno a3 = new Aluno("Kiko", 7.0);
	Aluno a4 = new Aluno("Pri", 8.5);
	Aluno a5 = new Aluno("Jamal", 2.5);
	Aluno a6 = new Aluno("Nina", 10);
	
	List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
	//filtrar essa lista com alunos que tiraram nota acima de 7
	Predicate<Aluno> aprovados = b -> b.nota >= 7;//retorna verdadeiro ou falso 
	Function<Aluno, String> saudacao = b -> "A nota de "+b.nome+" foi "+b.nota+", parabéns!!!";//retorna string 
	
	System.out.println("Aprovados");
	alunos.stream()
	.filter(aprovados)//se a nota for maior que sete sera passado em diante
	.map(saudacao)
	.forEach(System.out::println);
	}
}
