package entities;

public class Aluno {
	
	public String nome;
	public double primeiroTrimestre;
	public double segundoTrimestre;
	public double terceiroTrimestre;
	public double total;
	
	public void notaFinal() {
		total = primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
		System.out.println("Nota final: " + total);
		difference();
	}
	
	public boolean approval() {
		if(total >= 100) {
			System.out.println("Aluno " + nome + " voce foi aprovado");
			return true;
		} else {
			System.out.println("Aluno " + nome + " voce foi reprovado");
			return false;
		}
	}
	
	public void difference() {
		if(approval() == false) {
			double difference = 100 - total;
			System.out.println("Pontos necessária para aprovação: " + difference);
		}
	}

}
