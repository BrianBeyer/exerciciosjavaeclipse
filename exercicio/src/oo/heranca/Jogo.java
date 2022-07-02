package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Jogador();
		j1.x = 10;
		j1.y = 10;
		j1.andar(Direcao.NORTE);
		
		Jogador j2 = new Jogador();
		j2.x = 10;
		j2.y = 10;
		
		j1.atacar(j2);//jogador 1 ataca jogador 2
		System.out.println("vida do jogador 2 = "+j2.vida);
		
		Heroi h1 = new Heroi();
		Monstro m1 = new Monstro();
		m1.andar(Direcao.LESTE);
		m1.atacar(h1);//monstor ataca heroi
		m1.atacar(h1);
		m1.atacar(h1);
		h1.atacar(m1);//heroi ataca montro
		System.out.println("Vida do heroi = "+h1.vida);
		System.out.println("Vida do monstro = "+m1.vida);
		
		

//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.SUL);
//		j1.andar(Direcao.SUL);
//		j1.andar(Direcao.OESTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.LESTE);

		System.out.println("X" + j1.x);
		System.out.println("Y" + j1.y);
	}
}
