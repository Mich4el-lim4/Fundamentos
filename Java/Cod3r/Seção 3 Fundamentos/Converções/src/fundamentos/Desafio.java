package fundamentos;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário:");
		String valor1 = sc.next().replace(",", ".");
		
		System.out.print("Informe o segundo salário:");
		String valor2 = sc.next().replace(",", ".");
		
		System.out.print("Informe o terceiro salário:");
		String valor3 = sc.next().replace(",", ".");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos salários é " + media);
		
		sc.close();
	}

}
