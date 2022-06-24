package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
//		- chave/valor, exemplo: cpf/nome - nome/telefone
//		- chave nao aceita repetiçao
//		- valor aceita repetição
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Rob");// adicionando valores e substitui caso ja exista
		usuarios.put(2, "Ric");
		usuarios.put(3, "Dan");
		usuarios.put(4, "Jão");
		usuarios.put(5, "Betty");
		System.out.println("Tamanho do mapa: " + usuarios.size());

		System.out.println(usuarios.keySet());// mostra as chaves
		System.out.println(usuarios.values());// mostra os valores
		System.out.println(usuarios.entrySet());// para mostrar chave e valor
		System.out.println("Contem a chave 1? " + usuarios.containsKey(1));
		System.out.println("Contem o valor Jully? " + usuarios.containsValue("jully"));
		System.out.println("Qual o valor da chave 2? " + usuarios.get(2));// retorna o valor da chave
		System.out.println("Qual valor foi removido? " + usuarios.remove(5));//retorna o valor removido
		System.out.println("Alguem foi removido? "+usuarios.remove(5, "Juju"));//retorna verdadeiro ou 
		//falso se alguem foi removido ou nao
		for (int chave : usuarios.keySet()) {// foreach para mostrar as chaves do mapa
			System.out.print(chave + " ");
		}
		System.out.println(" ");

		for (String valor : usuarios.values()) {// para mostrar os valores
			System.out.println(valor + " ");
		}
		for (Entry<Integer, String> registro : usuarios.entrySet()) {// entry java.util.map
			System.out.print(registro.getKey() + "-->");
			System.out.println(registro.getValue());
		}
	}
}