package oo.heranca.desafio;

public class Ferrari extends Carro {

	@Override // anota�ao para subscrever
	void acelerar() {
		velocidadeAtual += 15;
	}
}
