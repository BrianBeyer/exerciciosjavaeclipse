package oo.composicao;

import java.util.ArrayList;

public class Aluno {
//exercicio de relaçao de muitos para muitos
//o aluno tem uma lista de cursos
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();
	// lista final nao pode ser apontada para outro endereço de memoria, nao pode
	// fazer o cursos receber outra lista, mas o conteudo da lista é variavel

	Aluno(String nome) {// contructor
		this.nome = nome;
	}

	// metodo para adicionar cursos
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);// esse this se refere ao objeto tipo Aluno, ele adiciona esse objeto Aluno a
								// lista <Aluno>
	}

	Curso obterCursoPorNome(String nome) {// metodo que retorna o nome do curso que foi pesquisado, se nao existir o
											// curso retorna nulo
		for (Curso curso : this.cursos) {// percorrer na lista curso
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}

	public String toString() {
		return nome;
	}
}
