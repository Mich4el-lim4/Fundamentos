package entities;

public class Employee {
	
	public String name;
	public double grossSalay;
	public double tax;
	
	public double netSalary() {
		return this.grossSalay - tax;
	}
	
	public void increaseSalary(double percentage) {
		double salaryPlusPercentage = netSalary() * (percentage / 100);
		double total = salaryPlusPercentage + netSalary();
		System.out.println("Updated data: ");
		System.out.println("Nome: " + this.name);
		String.format("Salario liquido: %.2f", netSalary());
		System.out.println("Porcentagem do acrecimo: " + percentage + "%");
		System.out.println("Valor do acrecimo: " + salaryPlusPercentage);
		System.out.println("Valor total: " + total);
	}
	
	public String toString() {
		return "Employee: "
				+ this.name
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}

}
