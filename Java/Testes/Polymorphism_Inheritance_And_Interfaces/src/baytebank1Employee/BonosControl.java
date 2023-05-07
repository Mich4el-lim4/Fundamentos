package baytebank1Employee;

public class BonosControl {

	public void control(Funcionario funcionario) {
		double salario = funcionario.getSalario();
		double bonus = funcionario.getBonus();
		double total = salario + bonus;
		System.out.println("Salario de " + salario + " + bonus de " + bonus + ", total de: " + total);
	}
	
}
