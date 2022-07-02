package oo.composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();

	double total = 0;

	double ValorTotal() {
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
}
