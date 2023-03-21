
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerenteDiego = new Gerente();
		gerenteDiego.setNome("Diego lima");
		gerenteDiego.setCpf("123.444.125-22");
		gerenteDiego.setSalario(5000);
		
		System.out.println(gerenteDiego.getNome());
		System.out.println(gerenteDiego.getCpf());
		System.out.println(gerenteDiego.getSalario());
		
		gerenteDiego.setSenha(2222);
		boolean autenticou = gerenteDiego.authenticate(2222);
		System.out.println(autenticou);
		System.out.println(gerenteDiego.bonus());
		
	}

}

