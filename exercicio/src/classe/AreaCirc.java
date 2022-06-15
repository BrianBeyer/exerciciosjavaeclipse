package classe;

public class AreaCirc {
	double raio;
	final static double pi = 3.14;// final significa que a variavel nao pode ser modificada

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() { // metodo para calcular a area
		return pi * raio * raio;// formula da circunferencia pi vezes raio ao quadrado
		// outra forma de fazer a formula: pi * Math.pow(raio, 2)
	}
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}//metodo statico, metodo que pertence a classe, nao precisa criar instancia
}
//Static significa que o valor do atributo pertence a classe, e nao vai ser
//associado a instancia (objeto). O valor nao é modificado no objeto, ele fica estatico.
