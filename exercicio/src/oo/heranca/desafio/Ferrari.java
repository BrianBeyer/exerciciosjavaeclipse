package oo.heranca.desafio;

public class Ferrari extends Carro {

	@Override // anotaçao para subscrever
	void acelerar() {
		velocidadeAtual += 15;
	}
}
