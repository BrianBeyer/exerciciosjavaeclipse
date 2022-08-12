package excecao;

import java.util.Objects;

public class Aluno {

	public final String nome;
	public final double nota;
	
	public Aluno(String nome, double nota) {//construtor
		this.nome = nome;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return nome+" tem nota "+ nota;//para a classe MinMax
	}

	@Override //para a classe Outos
	public int hashCode() {
		return Objects.hash(nome, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	//classe com rela�ao a classe filter e reduce2 e MinMax
	
}