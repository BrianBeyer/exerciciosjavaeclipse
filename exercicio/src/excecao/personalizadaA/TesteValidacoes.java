package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("ana", 100);
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());//para a mensagem de erro
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("As exceções foram tratadas, Fim");
	}
}
