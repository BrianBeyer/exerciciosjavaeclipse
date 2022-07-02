package oo.heranca;

public class Heroi extends Jogador {//heroi herda as caracteristicas de jogador

	//subscrevendo o metodo para funcionar diferente no heroi
	
	boolean atacar(Jogador oponente) {// recebendo jogador como parametro
		int deltaX = Math.abs(x - oponente.x);
		// math abs retorna valor absoluto, ignora o valor negativo, -4 vira 4
		// x - oponente.x é a diferenca ente os valores do oponente e o jogador
		int deltaY = Math.abs(y - oponente.y);
		if (deltaX == 0 && deltaY == 1) {// se o jogador estiver ao lado do oponente
			oponente.vida -= 20; // o oponente recebe menos 10 de vida
			return true;
		} else if (deltaX == 1 && deltaY == 0) {// se o jogador estiver acim do oponente
			oponente.vida -= 20; // tambem vai ser possivel atacar
			return true;
		} else {
			return false; // pq nao eta perto um do outro e nao conseguiu atacar
		}

	}

}
