package oo.heranca.desafio;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual = 100;
	private int delta = 5;
	protected Carro(int velocidadeMaxima) {//so vai ser usado pra quem tem essa heranca(extends)
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;// se a velocidade atual + 5 for maior que a velocidade atual,
												// velocidade atual recebe velocidadeMAxima
		} else {
			velocidadeAtual += getDelta();
		}
	}

	public void frear() {
		if (velocidadeAtual >= 0) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual -= 0;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
}
