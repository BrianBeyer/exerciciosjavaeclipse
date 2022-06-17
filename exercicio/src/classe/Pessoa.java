package classe;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	void comer(Comida comida) {//recebe como parametro outro objeto da classe comida
		this.peso += comida.peso;
	}
	String apresentar() {
		return "Ol�, meu nome � "+nome+" e tenho "+peso+"Kg.";
	}
}
