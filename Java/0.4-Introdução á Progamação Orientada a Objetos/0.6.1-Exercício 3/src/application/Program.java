package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Digite a nota do primeiro trimestre: ");
		aluno.primeiroTrimestre = sc.nextDouble();
		
		System.out.print("Digite a nota do segundo trimestre: ");
		aluno.segundoTrimestre = sc.nextDouble();
		
		System.out.print("Digite a nota do terceiro trimestre: ");
		aluno.terceiroTrimestre = sc.nextDouble();
		
		aluno.notaFinal();
		
		sc.close();
	}

}
