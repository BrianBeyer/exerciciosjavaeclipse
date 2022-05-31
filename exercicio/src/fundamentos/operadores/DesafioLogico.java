package fundamentos.operadores;

public class DesafioLogico {
	public static void main(String[] args) {
		
		//se conseguir um dos trabalho, compra a tv de 32
		//se conseguir os dois trabalhos, compra a tv de 50
		//se nao conseguir nenhum, fica em casa
		//se conseguir algum, toma sorvete
		boolean trabterca = false;
		boolean trabquinta = true;
		//alt + shift + a para selecionar varias linhas
		boolean tv50 = trabterca && trabquinta;
		boolean tv32 = trabterca ^ trabquinta;
		boolean sorvete = trabterca || trabquinta; 
		
		System.out.println("Comprou a Tv de 50 polegadas? "+ tv50);
		System.out.println("Comprou a Tv de 32 polegadas? "+ tv32);
		System.out.println("A familia saiu em casa? "+sorvete);
		System.out.println("Mais saldavel por nao tomar sorvete? "+!sorvete);//nao sorvete
	}
}
