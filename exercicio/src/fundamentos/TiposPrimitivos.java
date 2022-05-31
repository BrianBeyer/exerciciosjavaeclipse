package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//tipos numericos inteiros
		byte anosDeEmpresa = 23;//para numero entre -128 ate 127
		short numeroDeVoos = 543;
		int id = 56789;
		long pontosAcumulados = 3_134_234_444L; //é possivel separar numeros com _ para facilitar a leitura, colocar um L no final
		
		//tipos numericos reais
		float salario = 11_445.44f;//colocar o F no final
		double vendas = 2_455_234_223.1;
		
		//tipos boolean
		boolean estaDeFerias = true;
		
		//tipo caracter
		char status = 'A'; // para um caracter, pode ser numero ou simbolo
		char dado = '2';// deve estar em aspas simples
		
		System.out.println("O funcionatio tem "+anosDeEmpresa*365 + " anos de empresa.");
		System.out.println("O funcionario fez "+numeroDeVoos/2+" viagens.");
		System.out.println("A relação de pontos acumulados é "+ pontosAcumulados/vendas);
		System.out.println("O funcionario "+id+" ganha R$"+salario);
		System.out.println("Esta de ferias? "+ estaDeFerias);
		System.out.println("Status: "+status);
		System.out.println(dado);

	}
}
