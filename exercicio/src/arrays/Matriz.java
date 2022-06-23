package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na turma? ");
		int quantAlunos = entrada.nextInt();

		System.out.println("Quantas notas cada aluno tem?");
		int quantNotas = entrada.nextInt();
		
		double[][] notasTurma = new double[quantAlunos][quantNotas];//matriz com duas dimensões
			//O primeiro [] correesponde ao length da matriz
		double total = 0;
		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				System.out.println("Digite a "+(n+1)+" nota do "+(a+1)+" aluno: ");
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
			}
		}
		double media = total / (quantAlunos * quantNotas);
		System.out.println("A media da turma é "+media);
		
		for(double[] notasDoAluno: notasTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		

		entrada.close();
	}
}
