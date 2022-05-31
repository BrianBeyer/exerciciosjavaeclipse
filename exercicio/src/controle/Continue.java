package controle;

public class Continue {
	public static void main(String[] args) {
		
		for(int i =0; i<10;i++) {
			if(i%2==1) {//se o i for impar
				continue;
			}
			System.out.println(i);
		}

	}
}
