package classe;

public class DataExercicio {
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada(){
		return dia+"/"+mes+"/"+ano;
	}
	//outra forma de mostrar a data
	void imprimirData() {//void quando nao tem retorno
		System.out.println(dia+"/"+mes+"/"+ano);
	}
}// recomendado usar sempre metodos com retornos
