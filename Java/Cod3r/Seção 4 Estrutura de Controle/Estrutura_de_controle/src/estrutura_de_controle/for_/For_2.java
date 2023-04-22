package estrutura_de_controle.for_;

import java.util.Scanner;

public class For_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}

		sc.close();
	}

}
