package estrutura_de_controle.If_else_If;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota: ");
		double nota = sc.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");
		} else if(nota == 10) {
			System.out.println("Nota A");
			System.out.println("Parabéns, nota maxima");
		} else if(nota >= 7.5 ) {
			System.out.println("Nota B");
		} else if(nota >= 5) {
			System.out.println("Nota C");
		} else if(nota >= 2.5) {
			System.out.println("Nota D");
		} else {
			System.out.println("Nota E");
		}
		
		sc.close();
	}

}
