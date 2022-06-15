package classe;

public class DataTeste {
	public static void main(String[] args) {

		DataExercicio d1 = new DataExercicio();
	
		//d1.dia = 23;
		///d1.mes = 04;
		///d1.ano = 1999;
		System.out.println("Data escolhida(d1): dia " + d1.dia + " mes de " + d1.mes + " e ano " + d1.ano);
	
		DataExercicio d2 = new DataExercicio();
		d2.dia = 14;
		d2.mes = 05;
		d2.ano = 2049;
		System.out.println("Data escolhida (d2): dia " + d2.dia + " mes de " + d2.mes + " e ano " + d2.ano);
		
		DataExercicio d3 = new DataExercicio(22,11,2024);
		//d3.dia = 19;
		//d3.mes = 12;
		//d3.ano = 1977;
		System.out.println("(d3)"+d3.obterDataFormatada());
		//d1.imprimirData();
		
	}
}
