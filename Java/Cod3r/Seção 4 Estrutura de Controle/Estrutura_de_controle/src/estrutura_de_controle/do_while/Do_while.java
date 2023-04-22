package estrutura_de_controle.do_while;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String texto;
		
		do {
			System.out.print("Deseja sair: ");
			texto = sc.nextLine();
		} while(!texto.equalsIgnoreCase("sim"));
		
		System.out.println("Fim");

		sc.close();
	}

}
