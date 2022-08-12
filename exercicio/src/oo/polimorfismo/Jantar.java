package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		// pilimosfismo dinamico

		Pessoa p1 = new Pessoa(90);

		Arroz prato1 = new Arroz(0.2);
		Feijao prato2 = new Feijao(0.3);
		System.out.println(p1.getPeso());

		p1.comer(prato1);
		p1.comer(prato1);
		p1.comer(prato2);
		System.out.println(p1.getPeso());

		Sorvete sobremesa1 = new Sorvete(0.1);

		p1.comer(sobremesa1);
		System.out.println(p1.getPeso());
	}
}
