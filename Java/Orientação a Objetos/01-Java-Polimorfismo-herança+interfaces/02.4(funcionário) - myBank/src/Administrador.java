
public class Administrador extends Funcionario implements Autenticavel {
	
	private Validation autenticador;

	public Administrador() {
		this.autenticador = new Validation();
	}
	
	@Override
	public boolean authenticate(int senha) {
		boolean autenticou = this.autenticador.authenticate(senha);
		return autenticou;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public double bonus() {
		return 50;
	}
}
