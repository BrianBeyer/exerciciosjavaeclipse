package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
//collection nao suporta tipos primitivos
		conjunto.add(1.2); //metodo para adicionar dados ao conjunto
		//vai ser convertido de double para objeto Double
		conjunto.add(true);//boolean para Boolean
		conjunto.add("Teste");// String ja é objeto
		conjunto.add(1);// int para Integer
		conjunto.add("x");//char para Character
		
		conjunto.add("Teste");//valores repetidos serao ignorados
		
		System.out.println("O tamanho do conjunto é: "+conjunto.size()+" elementos.");
		
		System.out.println("Removel algum dado? "+conjunto.remove("Teste"));// vai retornar true ou falso
		//true se conseguiu remover algum dado 
		System.out.println("Removel algum dado? "+ conjunto.remove("abc"));
		
		System.out.println("O tamanho atualizado do conjunto é: "+conjunto.size()+" elementos.");
		
		System.out.println("Contem o valor 1? "+conjunto.contains(1));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println("Valores de nums: "+nums);
		System.out.println("Valores de conjunto: "+conjunto);
		//conjunto.addAll(nums);//para unir nums e conjunto
		System.out.println("União de nums e conjuto "+ conjunto);
		
		conjunto.retainAll(nums);
		System.out.println("Os valores comuns entre os dois conjuntos "+ conjunto);
		
		conjunto.clear();//limpa todos os dados do conjunto
		System.out.println("Conjunto limpo:"+conjunto);
		
		
		
		
	}
}
