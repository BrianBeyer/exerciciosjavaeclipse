package oo.heranca.desafio;

public class Fusca extends Carro {
	public Fusca() {
		this(120);//essa é a velocidade maxima do carro
	}//this chama o metodo abaixo
	
	public Fusca(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
}