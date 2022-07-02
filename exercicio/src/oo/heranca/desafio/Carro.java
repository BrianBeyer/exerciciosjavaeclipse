package oo.heranca.desafio;

public class Carro {
	int velocidadeAtual = 100;

	void acelerar() {
		if (velocidadeAtual > 250) {
			velocidadeAtual += 0;
		} else {
			velocidadeAtual += 5;
		}
	}

	void frear() {
		if (velocidadeAtual >= 0) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual -= 0;
		}
	}
}
