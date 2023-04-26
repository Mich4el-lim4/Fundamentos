package Arrays_end_Collections;

import java.util.Scanner;

public class Exer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Quantas notas: ");
		int quantidade = sc.nextInt();
		
		double[] notas = new double[quantidade];
		
		for(int i = 0; i < notas.length; i ++) {
			System.out.print("Digite a " + (i + 1) + "° nota: ");
			notas[i] = sc.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é " + media);
		
		sc.close();
	}

}
