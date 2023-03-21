
public class TesteSistemaInterno {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Carlos Henrique");
		gerente.setSenha(2222);
		
		Administrador administrador = new Administrador();
		administrador.setNome("Paulo Eduardo");;
		administrador.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Ana");
		cliente.setSenha(2222);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.authenticate(gerente);
		sistema.nome(gerente);
		sistema.authenticate(administrador);
		sistema.nome(administrador);
		
		if(sistema.authenticate(cliente) == true) {
			System.out.println(cliente.getNome());
		}
	}
}
