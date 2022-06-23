package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {

		ArrayList<ObjetoLista> lista = new ArrayList<>();//lista criada
		
		ObjetoLista u1 = new ObjetoLista("Ana");//criaçao do objeto passando o parametro string do metodo construtor
		
		lista.add(u1); //objeto inserido á lista
		lista.add(new ObjetoLista("Lia"));// inserindo outro item á lista
		lista.add(new ObjetoLista("Gab"));
		lista.add(new ObjetoLista("Babs"));
		lista.add(new ObjetoLista("Bia"));
		System.out.println("Mostrar o terceiro elemento da lista: "+lista.get(3).nome);

		//System.out.println("Existe esse elemento na lista? "+ lista.contains(new ObjetoLista("kk")));
		for(ObjetoLista u: lista) {//foreach
			//System.out.print(u.nome+" ");//dessa forma vem sme a formataçao do toString
			
			System.out.println(u);//aqui vem co ma formataçao do toString
			//pode escrever u.toString mas o metodo pe chamado implicitamente
			
			//para remover elementos da lista tem duas formas:
			lista.remove(1);//pelo indice
			lista.remove(new ObjetoLista("Gab"));//ou pelo elemento
			
			
		}
	}
}
