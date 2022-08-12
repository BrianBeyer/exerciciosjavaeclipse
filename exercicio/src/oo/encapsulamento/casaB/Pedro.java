package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {// herança
	void testeAcesso() {
		//Ana mae = new Ana(); caso fosse ser acessado via instancia
//		System.out.println(segredo);// nao sera possivel acessar pois é privado
//		System.out.println(facoDentroDeCasa);// segundo nivel mais restrito, com visibilidade no pacote, sera
													// possivel acessar
		System.out.println(formaDeFalar);// visivel pois é do mesmo pacote
		System.out.println(todosSabem);// acesso publico
	}//obs; o protected so vai ser acessado via herança e nao via instancia 
}
