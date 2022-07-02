package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Kiko");
		Aluno a2 = new Aluno("Juju");
		Aluno a3 = new Aluno("Jamal");
		
		Curso c1 = new Curso("Culinaria");
		Curso c2 = new Curso("Filosofia");
		Curso c3 = new Curso("Medicina");
		
		//relacionamento
		c1.adicionarAlunos(a1);//aluno1 foi adicionado ao curso1
		c1.adicionarAlunos(a2);
		
		c2.adicionarAlunos(a1);
		c2.adicionarAlunos(a3);
		
		a1.adicionarCurso(c3);//curso3 foi adicionado ao aluno1
		a2.adicionarCurso(c3);
		a3.adicionarCurso(c3);
		
		for(Aluno aluno: c1.alunos) {//para mostrar quem esta no curso1
			System.out.print("Estou matriculado no curso 1 ");
			System.out.println("e nome é "+ aluno.nome+".");
		}
		for(Curso curso: a2.cursos) {
			System.out.print("O aluno esta matriculado no curo: ");
			System.out.println(curso.nome);
		}
		//System.out.println(a3.cursos.get(0).alunos);//todos oa alunos do curso1 get[0]
	
		Curso cursoEncontrado = a1.obterCursoPorNome("culinaria");
		if(cursoEncontrado != null) {
			System.out.print("No curso "+cursoEncontrado.nome+" esta matriculado :");
			System.out.println(cursoEncontrado.alunos);
			//mostra o curso e os alunos que estao nesse curso
		}else {
			System.out.println("Curso não encontrado.");
		}
	}
	
}
