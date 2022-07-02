package oo.composicao.desafio;

public class Item {

	final Produto produto; // o item aponta para um unico produto e nao uma lista
	final int quant;

	Item(Produto produto, int quant) {// metodo construtor recebe Produtos e a quantidade
		this.produto = produto;
		this.quant = quant;
	}
}
