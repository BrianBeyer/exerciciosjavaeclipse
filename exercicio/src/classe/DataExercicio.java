package classe;

public class DataExercicio {
	int dia;// o this faz referencia a essa variavel
	int mes;
	int ano;

	DataExercicio() {// construtor padrao
		// dia = 01;
		// mes = 01;
		// ano = 1970;
		// é possivel representar esse construtor chamando um metodo, um metodo dentro
		// do outro
		// o this abaixo vai chamar o construtor com a assinatura de metodos iguais
		this(1, 1, 1970);//so pode ser usado dentro de um construtor
		//esse this() é um metodo para um construtor chamar outro construtor
	}

		DataExercicio(int dia, int mes, int ano) {// construtor com parametos, esta sendo chamado pelo this acima
		this.dia = dia;// o this indica que se trata da variavel da instancia
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		return dia + "/" + mes + "/" + ano;
	}

	// outra forma de mostrar a data
	void imprimirData() {// void quando nao tem retorno
		System.out.println(dia + "/" + mes + "/" + ano);
	}
}// recomendado usar sempre metodos com retornos
