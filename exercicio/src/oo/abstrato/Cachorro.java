package oo.abstrato;

public class Cachorro extends Mamifero {
//obrigatorio sobrescrever os metodos abstratos e opcional para metodo concreto
//nessa classe comcreta que vai ser necessario implementar todos os metodos
	public String mover() {
		return "Com patas";
	}
	public String mamar() {
		return "Leite";
	}
}
