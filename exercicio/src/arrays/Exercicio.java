package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {

		double notasAluno[] = new double[3];
		// criando uma array (variavel composta) com 3 posiçoes (0 ate 2)
		notasAluno[0] = 6.9;
		notasAluno[1] = 5.5;
		notasAluno[2] = 10;// colocando dados na array
		// para imprimir array, importar arrays .toString()
		System.out.println(Arrays.toString(notasAluno));

		double total = 0;
		for (int i = 0; i < notasAluno.length; i++) {// length tamanho do array
			total += notasAluno[i]; // para percorrer e somar os calores da array
		}
		System.out.println("Media do aluno A: "+total / notasAluno.length);// para mostrar a media
		System.out.println("A primeira nota do aluno A foi: "+notasAluno[0]);
		
		double notasAlunoB[] = { 6.8, 3.5, 5.8, 10 };// array com valores pre determinados
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		System.out.println("Media do aluno B: "+totalB / notasAlunoB.length);
		
	}
}
