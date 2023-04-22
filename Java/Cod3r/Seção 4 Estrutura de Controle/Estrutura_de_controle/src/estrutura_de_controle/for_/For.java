package estrutura_de_controle.for_;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int contador = 10; contador >= 0; contador -= 2) {
			System.out.printf("Contador = %d\n", contador);
		}

		sc.close();
	}

}
