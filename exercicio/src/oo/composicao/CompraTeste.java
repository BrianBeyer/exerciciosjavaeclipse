package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {

		Compra c1 = new Compra();
		c1.cliente = "Joao";
		c1.itens.add(new Item("Caneta", 20, 7.45));
		// acima, adicionanto itens a lista pelo construtor
		c1.itens.add(new Item("Borracha", 10, 5.95));
		c1.itens.add(new Item("Caderno", 4, 10.10));
		
		
		System.out.println("A quantidade de itens comprados é: "+c1.itens.size());
		System.out.println("O total é R$"+c1.ValorTotal());
	}
}
