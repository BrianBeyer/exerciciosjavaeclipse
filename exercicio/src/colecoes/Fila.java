package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		// offer e add adicionam elementos a lista
		fila.add("Ana");// quando a fila tem um numero limitado de elementos, e um 
		//elemento a mais for inserido quando a fila estiver cheia, usando o .add 
		//o programa ira retornar um erro, se for usado o .offer, o programa retornara valor falso
		fila.offer("Bia");
		fila.add("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");
		fila.offer("Carlos");

		//.peek e .element mostram o proximo elemento da fila
		//se a fila estiver vazia ou nao tiver o proximo elemento,
		// .peek retorna null e .element retorna um erro
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		
		//fila.clear();//limpa a fila
		System.out.println("A fila tem "+fila.size()+" elementos.");
	
		System.out.println("A fila esta vazia? "+fila.isEmpty());//retorna verdadero, ou falso se a fila estiver vazia
	
		//poll e remove obtem o proximo elemento da fila e remove
		//pool retorna null e remove retorna um erro caso nao tenha mais elementos
		System.out.println(fila.poll());//mostra o primeiro elemento da lista
		System.out.println(fila.poll());//chamando de novo, apaga o anterios e mostra o proximo dal ista
	    System.out.println("Usando poll "+fila.poll());
	    System.out.println("Usando remove "+fila.remove());
	    
	    System.out.println("Contem tal elemento na fila? "+fila.contains("Carlos"));
//	    queue: (fila)
//	    - implementa fila
//	    - first in/ first out, o primeiro a entrar é o primeiro a sair
	}
}
