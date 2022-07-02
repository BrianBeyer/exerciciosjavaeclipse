package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	final ArrayList<Item> itens = new ArrayList<>();// compra tem uma lista de itens

	void adicionarItem(Produto p, int quant) {
		this.itens.add(new Item(p, quant));// adicionado a lista o construtor Item
	}

	// no metodo abaixo ja é passado o nome do produto, preco e quantidade e
	// adicionado á lista
	void adicionarItem(String nome, double preco, int quant) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quant));// adicionado a lista o construtor Item
	}

	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {// percorrendo a lista itens
			total += item.quant * item.produto.preco;
		}

		return total;
	}
}
