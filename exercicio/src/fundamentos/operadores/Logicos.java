package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3>7;
		System.out.print("Condi��o 1 e 2 ");
		System.out.println(condicao2 && condicao1);
		
		System.out.print("Condi��o 1 ou 2 ");
		System.out.println(condicao2 || condicao1);
		
		System.out.print("Condi��o 1 ou exclusivo 2 ");
		System.out.println(condicao2 ^ condicao1);
		
		System.out.print("Nega��o da condi��o 1 ");
		System.out.println(!condicao1);
		
	}
}
