package fundamentos;

public class Temperatura {
	
	public static void main(String[] agrs) {
		final double AJUSTE = 32;
		final double FATOR = 5/9.0;
		
		
		double f = 150; //FAHRENHEIT
		double c = (f - AJUSTE)*FATOR;
		System.out.println("O resuntado é "+c+"°C");

		
		f = 86; //FAHRENHEIT
		c = (f - AJUSTE)*FATOR;
		System.out.print("O resuntado é "+c+"°C");
	}
}
