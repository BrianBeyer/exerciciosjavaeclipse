package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {
	private Validar() {// contrutor
	}
	public static void aluno(Aluno aluno) {
		if(aluno == null) {//tipo de excecao do proprio java
			throw new IllegalArgumentException("O aluno esta nulo");
		}
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			//se nome do aluno esta nulo ou vazio. trim tira os espaços 
			//abaixo a excecao
			throw new StringVaziaException("nome");
		}
		if(aluno.nota <0 || aluno.nota >10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
