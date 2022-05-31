package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Bem vindos".charAt(4));// mostra qual a letra em tal indice
		String s = "Bom dia";
		System.out.println("Come�a com Bom? " + s.startsWith("Bom"));// verifica se a string inicia com aquele valor e
																		// retorna verdadeiro ou falso
		System.out.println("Termina com dia ? " + s.endsWith("noite"));// verifica como a frase termina
		System.out.println("A frase tem " + s.length() + " letras");
		System.out.println("� exatamente igual? " + s.equals("bom dia"));// compara se a variavel � igual ao valor
		System.out.println("Ignorando se � maiusculo ou n�o, s�o iguais? " + s.equalsIgnoreCase("bom dia"));// ele ignora se � maiusculo ou nao
		System.out.println("Frase qualquer".contains("qu"));// verifica se o valor existe em algum lugar da frase
		System.out.println("Qual a posi��o do d? "+s.indexOf("d"));//retorna a posi��o do valor 
		System.out.println("Frase qualquer".substring(6,8));//retorna so o valor no intervalo colocado, da posicao 6 ate a 7; a 8 � descartada

		// outras formas de formatar strings
		var empresa = "Intel";
		var local = "Alasca";
		var anos = 44;
		var valor = 123_999f;

		System.out.printf("A empresa %s localizada no %s tem %d anos e seu valor de mercado � U$%.2f ", empresa, local,anos, valor);
		// %s para string - %d para inteiro - %.2f para floar com 2 casas depois da virgula
		//ou
		
		String formatada = "\n\nempresa: "+ empresa + "\nlocal: "+local+"\nanos: "+anos+"\nvalor: "+valor;
		System.out.println(formatada);
	}
	
}
