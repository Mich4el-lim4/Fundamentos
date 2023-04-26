package calculations;

import java.util.Scanner;

public class TestCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculator calculator = new Calculator();
		
		int option = 0;
		
		do {
			
			System.out.println("Calculadora");
			System.out.println();
			System.out.println("1-Para somar");
			System.out.println("2-Para dividir");
			System.out.println("3-Para subtrair");
			System.out.println("4-Para subtrair");
			System.out.print("Digite a opção: ");
			option = sc.nextInt();
			System.out.println();
			
			if(option == 1) {
				System.out.println("Digite os numeros para somar");
				System.out.print("Primeiro numero: ");
				int numberOne = sc.nextInt();
				System.out.print("Segundo numero: ");
				int numberTwo = sc.nextInt();
				
				calculator.soma(numberOne, numberTwo);
				
			} else if(option == 2) {
				System.out.println("Digite os numeros para dividir");
				System.out.print("Primeiro numero: ");
				String numberOne = sc.next();
				System.out.print("Segundo numero: ");
				String numberTwo = sc.next();
				
				calculator.dividir(numberOne, numberTwo);
			}
			
		} while (option != 4);
		
		System.out.println();
		System.out.println("Fim!!");
		
		sc.close();
	}

}
