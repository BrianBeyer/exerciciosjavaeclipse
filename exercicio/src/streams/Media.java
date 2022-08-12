package streams;

public class Media {
	private double total;
	private int quantidade;

	public Media adicionar(double valor) {// retorna a propria media,
		// fazer dessa maneira para poder criar o objeto encadeando
		// as funcoes
		total += valor;
		quantidade++;
		return this;
	}

	public double getValor() {
		return total / quantidade;
	}

	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}
}
