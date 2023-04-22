package estrutura_de_controle.while_Indeterminado;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.printf("Você diz: ");
			valor = sc.nextLine();
		}

		
		sc.close();
	}
}
