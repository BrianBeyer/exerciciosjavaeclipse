package excecao;

public class Basico {
	//tipos de erro
	public static void main(String[] args) {
		Aluno a1 = null;
		try {//colocar no try algum codigo que pode gerar erro
		imprimirAluno(a1);
		}catch(Exception excecao) {
			//se acontecer o erro
			System.out.println("Erro ao executar o nome do usuario");
		}
	
		try {
			System.out.println(6 / 0);//erro matematico
		} catch (ArithmeticException e) {//tratando o erro de forma expecifica
			//e.printStackTrace();//esse metodo imprime a pilha de execucao e mostra o momento do erro
			//no lugar do metodo acima, pode usar uma mensagem, como esta abaixo
			System.out.println("Aconteceu um erro "+e.getMessage());
		}
		
		System.out.println("Os erros foram tratados, o programa chegou ao fim\ne essa é a mensagem provando o fim do programa.");	
	}
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);//erro por nao ter definido o aluno
	}
	
}
