
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNome("Michael");
		funcionario.setCpf("000.222.333-11");
		funcionario.setSalario(2600.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.bonus());
	}

}
