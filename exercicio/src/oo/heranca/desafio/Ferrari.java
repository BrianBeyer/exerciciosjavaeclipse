package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;//por padrao é false
	private boolean ligarAr;
	
	 public Ferrari () {
		this(250);//velocidade maxima do carro
	}//o this chama o metodo de baixo
	 public Ferrari (int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	@Override // anotaçao para subscrever
	public void acelerar() {
		velocidadeAtual += 15;
	}
	public void ligarTurbo(){//metodo que teve que ser implementado da interface
		ligarTurbo = true;
	}
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	public void ligarAr() {
		ligarAr = true;
	}
	public void desligarAr() {
		ligarAr = false;
	}
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {//se turbo ligado e ar desligado
			return 35;
		}else if(ligarTurbo && ligarAr){
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
		return 15;
		}
	}
}
