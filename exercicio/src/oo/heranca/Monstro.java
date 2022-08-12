package oo.heranca;

public class Monstro extends Jogador {
	public Monstro() {//construtor padrao
		this(0, 0);//todo monstro começa na posicao 0 e 0
	}
	public Monstro(int x, int y){
		super(x, y);
	}
}
//o primeiro construtor(padrao) chama o segundo construtor e esse
//segundo chama o construtor da classe superior