package excecao.personalizadaA;

public class NumeroForaIntervaloException extends RuntimeException {
	// tratar o erro de ser inserido um numero fora de 0 a 10
	private String nomeDoAtributo;

	public NumeroForaIntervaloException(String nome) {
		this.nomeDoAtributo = nome;
	}

	public String getMessage() {
		return String.format("O atributo %s esta fora do intervalo de 0 a 10", nomeDoAtributo);
	}
}
