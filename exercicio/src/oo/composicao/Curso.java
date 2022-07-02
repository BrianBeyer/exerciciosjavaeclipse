package oo.composicao;

import java.util.ArrayList;

public class Curso {
	//exercicio de relaçao de muitos para muitos
	//o curso tem uma lista de alunos
		final String nome;
		final ArrayList<Aluno> alunos = new ArrayList<>();
		
		Curso(String nome){
			this.nome = nome;
		}
		
		//metodo para adicionar alunos
		void adicionarAlunos(Aluno aluno){//retornar void vazio//da classe Aluno vai receber o String aluno
			this.alunos.add(aluno);//a lista alunos vai receber o nome de cada aluno da classe Aluno 
			aluno.cursos.add(this);//String aluno da lista cursos recebe esse aluno 
		}
}
