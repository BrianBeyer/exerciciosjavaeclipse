package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<ObjetoLista> usuarios = new HashSet<>();
		// ObjetoLista é da outra classe que esta nesse pacote

		usuarios.add(new ObjetoLista("Juju"));
		System.out.println(usuarios.contains(new ObjetoLista("Juju")));

	}
}
//aqui mostra a impostancia de usar o equals e o hashcode
//na classe objetoLista para comparar elementos iguais
