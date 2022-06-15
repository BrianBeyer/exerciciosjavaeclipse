package classe;

public class ProdutoTesteEx {
	public static void main(String[] args) {
		ProdutoEx p1 = new ProdutoEx("Laptop", 1000);
		System.out.println("----Loja 25% de desconto.----");
		//ProdutoEx.desconto = 0.1;//mudando o desconto para todos os metodos sem parametro
		System.out.printf("O preço final do "+p1.nome+" é R$"+ p1.precoComDesconto());
		
		System.out.println("");

		System.out.println("\nPromoção de natal com 50% de desconto!!!");
		
		//ProdutoEx.desconto = 0.50;
		ProdutoEx p2 = new ProdutoEx("Telemovel", 500);
		System.out.printf("O preço final do "+p2.nome+" é R$"+ p2.precoComDesconto(0.50));
	}//se for passado um parametro, sera dado o desconto passado, se nao sera dado o 
	// desconto padrao.
}
