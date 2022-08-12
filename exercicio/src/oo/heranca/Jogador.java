package oo.heranca;

public class Jogador {
	public int x;
	public int y;
	public int vida = 100;
	
	public Jogador(){//construtor padrao de forma explicita
		this(0, 0);
	}

	// Abaixo o construtor de forma explicita
	public Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean atacar(Jogador oponente) {// recebendo jogador como parametro

		int deltaX = Math.abs(x - oponente.x);
		// math abs retorna valor absoluto, ignora o valor negativo, -4 vira 4
		// x - oponente.x é a diferenca ente os valores do oponente e o jogador
		int deltaY = Math.abs(y - oponente.y);
		if (deltaX == 0 && deltaY == 1) {// se o jogador estiver ao lado do oponente
			oponente.vida -= 10; // o oponente recebe menos 10 de vida
			return true;
		} else if (deltaX == 1 && deltaY == 0) {// se o jogador estiver acim do oponente
			oponente.vida -= 10; // tambem vai ser possivel atacar
			return true;
		} else {
			return false; // pq nao eta perto um do outro e nao conseguiu atacar
		}

	}

	public boolean andar(Direcao direcao) { // Direcao do enum
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
		}

		return true;
	}
}
