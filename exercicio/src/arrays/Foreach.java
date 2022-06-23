package arrays;

public class Foreach {
	public static void main(String[] args) {

		double notas[] = { 9.9, 4.5, 2.4, 1.4 };
		
		for(double nota: notas) {//foreach vai percorrer cada um dos elementos, sem necessidade de comocar o contador do for
			System.out.println(nota);//variavel nota recebe o array notas
		}
	}
}
