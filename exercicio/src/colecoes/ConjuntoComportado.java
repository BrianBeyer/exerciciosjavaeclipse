package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
	public static void main(String[] args) {
	
		Set<String> listaAprovados = new HashSet<String>();// <String siginifica que a lista vai ser string obrigatoriamente>
		//o segundo <String> nao precisa ser repetido, basta colocar HashSet<>
		
		listaAprovados.add("Jamal");
		listaAprovados.add("Juju");
		listaAprovados.add("Janjão");
		listaAprovados.add("Kiko");
		
		//para mostrar a lista na ordem que os itens foram colocados, o codigo deve ser:
		//SortedSet<String> listaAprovados = new TreeSet<>();
		
		for(String candidatos: listaAprovados) {//foreach
			System.out.println(candidatos);
		}
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		for(int numeros: nums) {
			System.out.println(numeros);
		}
//		set:
//			- pode ser heterogeneo mas nao é recomendado (misturar varios tipos de dados: int, string, double)
//			- nao ordenado (por padrao) para organizar usar o sorted set
//			- nao indexado, nao é possivel acessar o elemento pelo idice
//			- nao aceita repetição, se um valor repitido for inserido, o programa ignora o valor repetido
		
	}
}
