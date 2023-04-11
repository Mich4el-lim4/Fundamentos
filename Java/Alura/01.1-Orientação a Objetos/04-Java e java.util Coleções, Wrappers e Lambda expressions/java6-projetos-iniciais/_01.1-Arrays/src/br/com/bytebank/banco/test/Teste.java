package br.com.bytebank.banco.test;

public class Teste {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades[0] = 59;
		idades[1] = 49;
		idades[2] = 24;
		idades[3] = 23;
		idades[4] = 19;
		
		int idade1 = idades[2];

		System.out.println(idade1);
		System.out.println(idades.length);
		System.out.println("---------------");
		
		int[] idade = new int[5];
		
		idade[0] = 59;
		idade[1] = 49;
		idade[2] = 24;
		idade[3] = 23;
		idade[4] = 19;
		
		for(int i = 0; i < idade.length; i++) {
			idade[i] = i * i;
		}
		
		for(int i = 0; i < idade.length; i++) {
			System.out.println(idade[i]);
		}
		
	}

}
