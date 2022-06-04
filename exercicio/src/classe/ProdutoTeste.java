package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
//new é a palavra reservada responsavel por chamar um construtor,
//o construtor é exatamente o nome da classe
//exemplo Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto();
		p1.nome = "Laptop";
		p1.preco = 4330.99;
		p1.desconto = 0.25;// para 25% de desconto

		var p2 = new Produto();// var esta fazendo uma inferencia
		p2.nome = "Caneta";
		p2.preco = 1.25;
		p2.desconto = 0.1;
		
		System.out.println(p1.nome);
		double precoDesconto1 = p1.preco * (1 - p1.desconto);
		System.out.printf("O preço com desconto é: R$%.2f.", precoDesconto1);
		System.out.println("\n"+p2.nome);
		double precoDesconto2 = p2.preco * (1 - p2.desconto);
		System.out.printf("O preço com desconto é: R$%.2f.", precoDesconto2);
		
		//fazendo agora com o metodo
		Produto p3 = new Produto();
		p3.nome = "Telemovel";
		p3.preco = 2000;
		p3.desconto = 0.15;
		double precoDesconto3 = p3.precoComDesconto();
		System.out.println("\n"+p3.nome);
		System.out.printf("O preço com desconto é: R$%.2f.",precoDesconto3);
		
	}
}
