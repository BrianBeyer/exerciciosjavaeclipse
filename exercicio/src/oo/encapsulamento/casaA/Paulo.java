package oo.encapsulamento.casaA;

public class Paulo {

	void testeAcesso() {
		Ana esposa = new Ana();

//	System.out.println(esposa.segredo);//nao sera possivel acessar pois é privado
		System.out.println(esposa.facoDentroDeCasa);// segundo nivel mais restrito, com visibilidade no pacote, sera
													// possivel acessar
		System.out.println(esposa.formaDeFalar);// visivel pois é do mesmo pacote
		System.out.println(esposa.todosSabem);// acesso publico
	}
}
