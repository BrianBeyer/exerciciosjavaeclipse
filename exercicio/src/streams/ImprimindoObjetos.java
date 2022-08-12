package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Bia", "Kiko", "Pan");

		// agora, formas diferentes de exibir a lista

		System.out.println("Lista em for");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		System.out.println("Lista em foreach");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		System.out.println("Lista iterator");// iteração é passar pela lista
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {//hasNext verifica se tem proximo na lista
			System.out.println(it.next());//next da o proximo da lista
		}
		System.out.println("Lista stream");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);//laço interno
	}
}
