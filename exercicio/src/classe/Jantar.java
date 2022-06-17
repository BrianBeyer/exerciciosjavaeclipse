package classe;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Batata", 0.500);
		Comida c2 = new Comida("Sorvete", 0.200);
		Pessoa p1 = new Pessoa("Kiko", 71);
		Pessoa p2 = new Pessoa("Janjão", 103);
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println("Após comer "+c1.nome+".");
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println("Após comer "+c2.nome+".");
		System.out.println(p1.apresentar());
		
		System.out.println("");
		
		
		System.out.println(p2.apresentar());
		p2.comer(c1);
		System.out.println("Após comer "+c1.nome+".");
		System.out.println(p2.apresentar());
		p2.comer(c2);
		System.out.println("Após comer "+c2.nome+".");
		System.out.println(p2.apresentar());
	}
	
}
