package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {

		double media = 5.6;
		String resultadoParcial = media >=5.0 ? "Recuperação":"Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		// a variavel vai receber aprovado se a operação for verdadeira e reprovado se
		// for falso
		System.out.println("O aluno esta: "+resultadoFinal);

	}
}
