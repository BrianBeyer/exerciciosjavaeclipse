package arrays;

public class ExercicioForeach {
	public static void main(String[] args) {

		double notasAlunoA[] = {6.9, 5.5, 10};
		for(double nota: notasAlunoA) {
			System.out.println("As notas do aluno A são: "+ nota);
		}
		System.out.println("");
		
		double notasAlunoB[] = { 6.8, 3.5, 5.8, 10 };
		for(double nota: notasAlunoB) {
			System.out.println("As notas do aluno B são: "+nota);
		}
	}
}


