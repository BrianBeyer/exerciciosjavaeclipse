package controle;

public class BreakContinueRotulado {
	public static void main(String[] args) {
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				//if(i==1) {
				//break externo; //rotulando o break para sinalizar a qual FOR se refere
				// continue externo
				//}
				System.out.println(i+" "+j);
			}
		}

	}
}
