package baytebank2Employee;

public class BonosControl {

	public void control(Funcionario funcionario) {
		double salario = funcionario.getSalario();
		double porcentagemBonus = funcionario.getPercentageBonus();
		double totalDeBonus = salario * (porcentagemBonus / 100);
		double total = salario + totalDeBonus;
		System.out.println();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.printf("Salario de %.2f%nporcentagem do bonus em %.0f%%%nvalor do bonus em dinheiro %.2f%ntotal %.2f%n", salario, porcentagemBonus, totalDeBonus, total);
	}
}
