package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		// nao recebe parametro e retorna algo
		// o retorno sera uma lista de strings
		Supplier<List<String>> umLista = () -> Arrays.asList("ju", "Ki", "Ma");
		// os () sao colocados quando nao tem parametro de entrada
		
		System.out.println(umLista.get());//metodo get para mostrar a lista
	}
}
