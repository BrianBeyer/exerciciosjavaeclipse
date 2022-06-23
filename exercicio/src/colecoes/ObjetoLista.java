package colecoes;

import java.util.Objects;

public class ObjetoLista {

	String nome;

	ObjetoLista(String nome){//metodo construtor
		this.nome = nome;
	}
	public String toString() {
		return "Meu nome é "+this.nome+".";
	}// quando o nome for chamado, ele vai vir concatenado dessa forma
	// hashcode e equals gerados abaixo por:
	//clicar com o botao direito na tela, source, generate hashcode and equals
		
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoLista other = (ObjetoLista) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
}
