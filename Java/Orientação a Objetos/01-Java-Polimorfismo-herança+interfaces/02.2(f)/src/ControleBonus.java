
public class ControleBonus {
	
	public void registra(Funcionario funcionario) {
		
		double bonus = funcionario.bonus();
		double total = bonus + funcionario.getSalario();
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salario de: R$" + funcionario.getSalario() + ", mais bonus de: R$" + bonus + ", total de: R$" + total);
		System.out.println();
	}

}
