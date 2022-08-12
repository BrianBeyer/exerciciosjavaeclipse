package excecao;

public class Checada {// checada e nao checada
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {//expecificando o erro
			System.out.println(e.getMessage());
			//e.getMessage é a mensagem associada ao erro
		}// chamando os metodos
		
		try {
			geraErro2();
		} catch (Throwable e) {//qualquer coisa que é throwable pode ser tratada dentro de um catch, aqui deixando de uma forma mais generica
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim do programa");
	}

	static void geraErro1() {
		//excecao nao checada ou nao verificada, tem a opcao de tratar ou nao o erro
		throw new RuntimeException("Ocorreu um erro legal 01");
		//throw é lançar, lance um erro com essa mensagem
	}

	static void geraErro2() throws Exception {
		//excecao checada ou verificada
		//precisa declarar que nesse metodo se lança uma excecao
		throw new Exception("Ocorreu um erro legal 02");
	}

}
