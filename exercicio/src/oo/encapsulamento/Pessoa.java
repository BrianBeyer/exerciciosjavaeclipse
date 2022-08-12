package oo.encapsulamento;

public class Pessoa {
//exercicio de getter e setter
	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome, String sobrenome, int idade) {//contructor
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	//metodo met e set do nome
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String nomeCompleto() {
		return getNome() + " "+getSobrenome();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//metodo getter
	public int getIdade() {
		return idade;
	}
	//metodo setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >=0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	@Override
	public String toString() {
		return "Olá eu sou o "+getNome()+" e tenho "+getIdade()+" anos.";
	}
}
