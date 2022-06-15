package classe;

public class DataExercicio {
	int dia;
	int mes;
	int ano;
	
	DataExercicio(){//construtor padrao
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	DataExercicio(int novoDia, int novoMes, int novoAno){//construtor com parametos
		dia = novoDia;
		mes = novoMes;
		ano = novoAno;
	}
	
	String obterDataFormatada(){
		return dia+"/"+mes+"/"+ano;
	}
	//outra forma de mostrar a data
	void imprimirData() {//void quando nao tem retorno
		System.out.println(dia+"/"+mes+"/"+ano);
	}
}// recomendado usar sempre metodos com retornos
