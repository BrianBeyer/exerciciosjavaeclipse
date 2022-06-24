package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
//	stack
//	- implementa pilha(stack)
//	- last in/first out, ultimo a entrar é o primeiro a sair
//    - como uma pilha de livros, olivro de cima que foi o ultimo a ser colocado
//    vai ser o primeiro a ser retirado
		Deque<String> livro = new ArrayDeque<>();

		// dois metodos para adicionar elementos
		livro.add("Magico de Oz");// retorna veradeiro ou falso, para se foi adicionado ou nao
		livro.push("Feliz natal");// retorna um erro se nao conseguir adicionar por ter passado
		// do limite estipulado para a pilha
		livro.push("O hobbit");
		livro.push("O serviço");
		livro.push("O malabarista");
		livro.push("Harry poter");
		//push adiciona no topo da fila
		//add segue a logica de uma fila, adiciona no final
		
		System.out.println(livro.peek());//o retorno sera o ultimo livro,
		//pois o ultimo a entrar é o primeiro a sair
		System.out.println(livro.element());
		System.out.println(livro.element());
		
		System.out.println(livro.poll());//mostra e remove
		System.out.println(livro.poll());
		System.out.println(livro.remove());
		System.out.println(livro.pop());//tambem remove o ultimo, caso nao tenha mais elementos
		//na lista, retorna um erro
		
		System.out.println("Tamanho da pilha: "+livro.size());
		//livro.clear();//limpa a pilha
		System.out.println("Contem esse livro? "+livro.contains("Harry poter"));
		System.out.println("A pilha esta vazia? "+ livro.isEmpty());
		
		for(String livros: livro) {
			System.out.println(livros);
		}
	}
}
