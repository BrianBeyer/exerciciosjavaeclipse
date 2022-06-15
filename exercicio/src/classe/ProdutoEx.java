package classe;

public class ProdutoEx {
	// nao tem classe principal aqui
	String nome;
	double preco, precoFinal, descontoNovo;
	static double desconto = 0.25;
	
	ProdutoEx(String nomeInicial) {
		nome = nomeInicial;
	}

	ProdutoEx() {// metodo construtor padrão, aquele que nao recebe parametro
	}

	ProdutoEx(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	double precoComDesconto() {//metodo para dar o desconto
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoEspecial) {//metodo para mudar o desconto
		return preco * (1 - descontoEspecial);
	}
}