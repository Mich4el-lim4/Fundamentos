package Arrays_end_Collections;

import java.util.Arrays;

public class Exer_forEach {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(double nota: notasAlunoA) {
			System.out.print(nota + " ");
		}
		
		System.out.println(total / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for (double nota: notasAlunoB) {
			System.out.print(nota + " ");
		}
		
		System.out.println();
		System.out.println(totalAlunoB / notasAlunoB.length);

	}

}
