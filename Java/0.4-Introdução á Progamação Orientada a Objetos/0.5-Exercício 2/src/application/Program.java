package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Digite o nome: ");
		employee.name = sc.next();
		
		System.out.print("Digite o salario bruto: ");
		
		employee.grossSalay = sc.nextDouble();
		
		System.out.print("Digite a taxa: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println(employee);
		
		System.out.println();
		System.out.print("Digite a porcetangem de acrecimo: ");
		double incremento = sc.nextDouble();
		employee.increaseSalary(incremento);
		System.out.println();
		
		sc.close();
	}

}
