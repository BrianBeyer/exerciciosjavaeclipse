package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();// lista de relação cliente/compra

	Cliente(String nome) {// contructor
		this.nome = nome;
	}
	
	//abaixo outro jeito de adicionar compras, sem expor a lista
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	double valorTotal() {// total de todas as compras
		double total = 0;
		for (Compra compra : compras) {// percorrer a lista de compras
			// o segundo compra é o nome da variavel
			total += compra.obterValorTotal();
		}
		return total;
	}
}
