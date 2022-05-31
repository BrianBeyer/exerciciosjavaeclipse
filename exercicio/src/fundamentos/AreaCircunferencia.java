package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] arg) {
		double raio = 3.4;
		final double PI = 3.14159; //final para impossibilitar a mudança do valor, recomendado usar letra maiuscula
		System.out.println(PI*raio*raio);
		
		double area = PI*raio*raio;
		System.out.println(area);
		
		raio = 10; // nao  precisa declarar o tipo de novo
		area = PI*raio*raio;
		System.out.println("A area é: "+area);
		
	}
}
