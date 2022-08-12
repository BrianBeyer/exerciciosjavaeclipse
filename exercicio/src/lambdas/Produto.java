package lambdas;

public class Produto extends Object {
	//o extends object sempre fica implitito em todas as classes
//relacionada a classe predicado
	final String nome;
	final double preco;
	final double desconto;
	
	//criado clicando com o botao direito, source, generate constructor
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;//em porcentagem
	}

	@Override
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return "O produto" + nome + " custa R$" + precoFinal;
	}
	
	
}
