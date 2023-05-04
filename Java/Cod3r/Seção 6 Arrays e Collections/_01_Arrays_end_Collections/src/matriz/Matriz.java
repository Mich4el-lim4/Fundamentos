package matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int quantidadeAlunos = sc.nextInt();
		
		System.out.print("Quantidade de notas por aluno: ");
		int quantidadeNotas = sc.nextShort();
		
		double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];
		
		double total = 0;
		
		for(int aluno = 0; aluno < notasDaTurma.length; aluno++) {
			for(int nota = 0; nota < notasDaTurma[aluno].length; nota++) {
				System.out.printf("Informe a nota %d do aluno %d: ", nota + 1, aluno + 1);
				notasDaTurma[aluno][nota] = sc.nextDouble();
				total += notasDaTurma[aluno][nota];
			}
		}
		
		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.println("Média da turma é " + media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}

		sc.close();
	}

}
