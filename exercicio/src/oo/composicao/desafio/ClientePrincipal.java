package oo.composicao.desafio;

public class ClientePrincipal {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Kiko");
		Compra comp1 = new Compra();
		Compra comp2 = new Compra();
		comp1.adicionarItem("Caneta", 2.5, 5);
		comp1.adicionarItem(new Produto("Laptop", 1999.90), 1);// usando o outro metodo

		comp2.adicionarItem("Casaco", 200.5, 2);
		comp2.adicionarItem(new Produto("Casaco", 200.5), 2);// mesmo produto usando outro metodo
		
		c1.compras.add(comp1); //cliente1 fez a compra1
		c1.adicionarCompra(comp2);//cliente1 fez tambem a compra2, usando o metodo
		
		
		System.out.println("O cliente "+c1.nome+" gastou no total R$"+c1.valorTotal());
	}
} // cliente<1--n>compra<1--n>itens<n--1>produto
