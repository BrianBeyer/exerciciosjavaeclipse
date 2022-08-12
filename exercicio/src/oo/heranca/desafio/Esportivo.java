package oo.heranca.desafio;

public interface Esportivo {
//interface
//uma classe pode herdar de varias interface
//E é obrigatorio implementar os metodos definidos na interface
//Por padrao a visibilidade da interface é publica
//Todo metodo na interface é abstract, nao tem corpo {}	
//Todo atributo na interface é publico static final
	public abstract void ligarTurbo();//por padrao ele é public e abstract
	void desligarTurbo();
	
}
