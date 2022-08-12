package excecao.personalizadaB;

public class StringVaziaException extends Exception {
	// tratar o erro de ser inserido um numero vazio
	private String nomeDoAtributo;

	public StringVaziaException(String nome) {
		this.nomeDoAtributo = nome;
	}

	public String getMessage() {
		return String.format("O atributo %s esta vazio", nomeDoAtributo);
	}
}
