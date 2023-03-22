package entities;

public class Employee {
	
	public String name;
	public double grossSalay;
	public double tax;
	
	public double netSalary() {
		return this.grossSalay - tax;
	}
	
	public void increaseSalary(double percentage) {
		double salaryPlusPercentage = grossSalay * percentage / 100;
		double total = salaryPlusPercentage + netSalary();
		System.out.println();
		System.out.println("Updated data: ");
		System.out.println();
		System.out.println("Nome: " + this.name);
		String.format("Salario liquido: %.2f", netSalary());
		System.out.printf("Porcentagem do acrecimo: %.0f", percentage);
		System.out.print("%\n");
		System.out.printf("Valor do acrecimo: %.2f%n", salaryPlusPercentage);
		System.out.printf("Valor total: %.2f", total);
	}
	
	public String toString() {
		return "Funcionario:\n"
				+ "nome: "
				+ this.name
				+ String.format("\nSalario total: $%.2f", netSalary());
	}

}
