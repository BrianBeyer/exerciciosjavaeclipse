package controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		int cont = 1;
		
		while(cont <= 10) {
			System.out.printf("contando: %d\n", cont);
			cont++; //ou cont+=2 para contar de 2 em 2 
		}

	}
}
