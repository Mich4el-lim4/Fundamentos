package fundamentos.ternario;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Informe o número: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Informe o operador: ");
		String operation = sc.next();
		
		double resultado = "+".equals(operation) ? num1 + num2 : 0;
		resultado = "-".equals(operation) ? num1 - num2 : resultado;
		resultado = "*".equals(operation) ? num1 * num2 : resultado;
		resultado = "/".equals(operation) ? num1 / num2 : resultado;
		resultado = "%".equals(operation) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operation, num2, resultado);
		
		sc.close();
	}

}
