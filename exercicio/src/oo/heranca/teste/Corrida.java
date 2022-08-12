package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class Corrida {
	public static void main(String[] args) {

		Ferrari fe1 = new Ferrari();
		Fusca fu1 = new Fusca();
		
		fe1.acelerar();
		fe1.acelerar();
		fe1.acelerar();
		fe1.frear();
		fe1.ligarTurbo();
		
		fu1.frear();
		
		
		System.out.println("Velocidade da Ferrari: "+fe1.velocidadeAtual+"Km/h");
		System.out.println("Velocidade do Fusca: "+fu1.velocidadeAtual+"Km/h");
	}
}
