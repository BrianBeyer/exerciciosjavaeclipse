package classe;

public class Produto {
//nao tem classe principal aqui
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(){//metodo construtor padr�o, aquele que nao recebe parametro
		
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto(double descontoExtra) {//uma passagem de parametro
		return preco*(1-desconto + descontoExtra);
	}
	//� possivel ter metodos com nomes iguais com parametros diferentes
	double precoComDesconto() {
		return preco*(1-desconto);
	}
}
