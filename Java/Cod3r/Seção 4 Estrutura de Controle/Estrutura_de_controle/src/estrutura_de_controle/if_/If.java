package estrutura_de_controle.if_;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = sc.nextDouble();

		if(media >= 7.0) {
			System.out.println("Aprovado");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		boolean disapprovalCriterion = media < 4.5 && media >= 0;
		
		if(disapprovalCriterion) {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}

}
