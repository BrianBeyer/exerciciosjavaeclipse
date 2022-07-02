package oo.composicao;

public class Carro {

	Motor motor = new Motor();

	void acelerar() {
		if (motor.fatorInjecao < 2.6) {//para limirar os giros do motor
			motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		} // so frear se o motor estiver acima de 0.5 para nao zerar a rotaçao
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}// retorna veradeiro ou falso se o motor esta ligado ou nao
}
