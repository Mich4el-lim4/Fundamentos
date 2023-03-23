package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a contação do dólar: ");
		double price = sc.nextDouble();
		
		System.out.print("Digite a quantidade de dólares para compra: ");
		double quantidade = sc.nextDouble();
		
		double totalParcial = Conversor.valorPagar(price, quantidade);
		double total = totalParcial * Conversor.IOF;
		
		System.out.print("Total mais taxa: ");
		System.out.printf("%.2f", totalParcial);
		System.out.print(" + 6 % de IOF");
		System.out.printf("%nValor total: %.2f", totalParcial + total);
		
		sc.close();
	}

}
