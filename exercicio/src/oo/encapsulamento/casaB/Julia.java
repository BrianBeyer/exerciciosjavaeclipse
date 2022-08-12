package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	void testeAcesso() {
		Ana sogra = new Ana();
//		System.out.println(sogra.segredo);// nao sera possivel acessar pois é privado
//		System.out.println(sogra.facoDentroDeCasa);// segundo nivel mais restrito, com visibilidade no pacote, sera
													// possivel acessar
//		System.out.println(sogra.formaDeFalar);// visivel pois é do mesmo pacote
		System.out.println(sogra.todosSabem);// acesso publico
	}
}